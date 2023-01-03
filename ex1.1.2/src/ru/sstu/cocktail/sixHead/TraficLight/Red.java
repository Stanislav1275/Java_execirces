package ru.sstu.cocktail.sixHead.TraficLight;

public class Red implements Colorable{
    @Override
    public Colorable next() {
        return new Yellow();
    }
    @Override
    public String toString() {
        return "Red";
    }
}
