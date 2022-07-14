package com.example.basket.controller;

import com.example.basket.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    List<Integer> addItems(@RequestParam("ids") List<Integer> items) { //из адресой строки передает в сервис
        return basketService.addItems(items);
    }

    @GetMapping("/get")
    List<Integer> getItems() {
        return basketService.getItems();
    }

}
