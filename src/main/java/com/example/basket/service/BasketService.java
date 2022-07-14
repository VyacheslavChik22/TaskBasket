package com.example.basket.service;

import java.util.List;

// на интерфейсах аннотации не нужны.
public interface BasketService {
    List<Integer> addItems(List<Integer> items); // из контроллера в корзину

    List<Integer> getItems();


}
