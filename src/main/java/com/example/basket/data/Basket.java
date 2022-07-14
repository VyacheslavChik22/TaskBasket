package com.example.basket.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private List<Integer> basketList; // Сущьность ( пока пустая корзина для продуктов)

    public Basket() {
        this.basketList = new ArrayList<>(); // При каждом создании объекта создается пустой лист
    }
    public void addItemsInBasket(List<Integer> items){ //пришли продукты, нужно их сохранить
        basketList.addAll(items);
    }

    public List<Integer> getBasketList() {
        return basketList;
    }
}
