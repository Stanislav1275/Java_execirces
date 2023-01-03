package ru.sstu.cocktail.SecondHead;

import ru.sstu.cocktail.SecondHead.ConstArray.ConstArray;
import ru.sstu.cocktail.SecondHead.FixedArray.FixedArray;

public class Main {
    public static void main(String[] args) {
        ConstArray carray = new ConstArray(1,2,3);
        FixedArray farray = new FixedArray();

        for(int i = 0; i < 100; i++)farray.insert(i,-1);
        System.out.println(farray.isAddable());
    }
}
