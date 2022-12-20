package ru.sstu.cocktail.Geometry.Fraction.Figure;

import ru.sstu.cocktail.ex_1_1_.Point2D;

abstract public class Figure {
    protected Point2D origin;

    public Figure(Point2D origin) {
        this.origin = origin;
    }

    public Figure() {
        this(new Point2D(0,0));
    }



    public abstract double area();


}
