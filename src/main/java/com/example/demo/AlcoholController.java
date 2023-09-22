package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/alcohol")
public class AlcoholController {

    private final AlcoholService alcoholService;

    public AlcoholController(AlcoholService alcoholService) {
        this.alcoholService = alcoholService;
    }

    @GetMapping(value = "/{price:\\d+}")
    public Alcohol getAlcohol(@PathVariable int price) {
        return alcoholService.getAlcohol(price);
    }
}
