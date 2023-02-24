package ru.sstu.cocktail.sixHead.Stock;

public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
