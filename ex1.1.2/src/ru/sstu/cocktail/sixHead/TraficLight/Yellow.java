package ru.sstu.cocktail.sixHead.TraficLight;

public class Yellow implements Colorable{
    @Override
    public Colorable next() {
        return new Red();
    }

    @Override
    public String toString() {
        return "Yellow";
    }
}
