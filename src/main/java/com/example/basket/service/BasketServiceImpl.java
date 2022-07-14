package com.example.basket.service;

import com.example.basket.data.Basket;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BasketServiceImpl implements BasketService {
    // Класс Basket изпользуется как тип переменной, с которой работает BasketServiceImpl
     private Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addItems(List<Integer> items) {
        basket.addItemsInBasket(items); //Добавленные вещи
        return items;
    }

    @Override
    public List<Integer> getItems() {
     List<Integer> result =  basket.getBasketList(); // Получаем все вещи из нашей корзины
     return result;                                 // Возвращаем их в контроллер для отображения
    }
}
