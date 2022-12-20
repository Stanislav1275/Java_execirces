package ru.sstu.cocktail.sixHead;

import java.util.List;

public interface Averageable<T> {
    T getAverage(List<T> list);
}
//0,1,2,3,4,5
//average(0)