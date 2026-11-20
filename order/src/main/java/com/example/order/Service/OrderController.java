
package com.example.order.Service;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final RestClient restClient;

    public OrderController() {
        this.restClient = RestClient.builder()
                .baseUrl("http://localhost:8081")
                .build();
    }

    @GetMapping
    public List<Map<String, Object>> getOrders() {
        return List.of(
                Map.of(
                        "id", 101,
                        "tourId", 1,
                        "tourName", "Du lịch Đà Nẵng",
                        "quantity", 2
                ),
                Map.of(
                        "id", 102,
                        "tourId", 2,
                        "tourName", "Du lịch Nha Trang",
                        "quantity", 1
                )
        );
    }

    @GetMapping("/tours/{id}")
    public String getProduct(@PathVariable int id) {
        return restClient.get()
                .uri("/api/tours/{id}", id)
                .retrieve()
                .body(String.class);
    }
}
