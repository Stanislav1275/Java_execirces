package ru.sstu.cocktail.fifth_head;

public interface Defaultable<T>{
    T getDefault(T object, T alternative);
}
