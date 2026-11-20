
package com.example.travel.service;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/tours")
public class TravelTourController {

    @GetMapping
    public List<Map<String, Object>> getTours() {
        return List.of(
            Map.of(
                "id", 1,
                "name", "Du lịch Đà Nẵng",
                "location", "Đà Nẵng",
                "price", 2500000
            ),
            Map.of(
                "id", 2,
                "name", "Du lịch Nha Trang",
                "location", "Khánh Hòa",
                "price", 3500000
            ),
            Map.of(
                "id", 3,
                "name", "Du lịch Huế",
                "location", "Thừa Thiên Huế",
                "price", 2000000
            ),
            Map.of(
                "id", 4,
                "name", "Du lịch England",
                "location", "England",
                "price", 15000000
            ),
            Map.of(
                "id", 5,
                "name", "Du lịch Mexico",
                "location", "Mexico",
                "price", 18000000
            )
        );
    }

    @GetMapping("/{id}")
    public Map<String, Object> getTour(@PathVariable int id) {
        return Map.of(
            "id", id,
            "name", "Du lịch Đà Nẵng",
            "location", "Đà Nẵng",
            "price", 2500000
        );
    }
}
