package ru.sstu.cocktail.sixHead.Stock;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Observed{
    private List<Observer> stockers;
    public final String name;
    private int price;

    public Stock(String name, int price) {
        this.name = name;
        this.price = price;
        stockers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        this.price = price;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        stockers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        stockers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer stock : stockers){
            stock.update(name, name + " : " + price);
        }
    }
}
