package ru.sstu.cocktail.ex_1_1_;

public abstract class Point {
    public abstract void shiftCoords(double xOffset, double yOffset);

    protected abstract void shiftCoords(double xOffset, double yOffset, double zOffset);
}
