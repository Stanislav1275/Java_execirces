package ru.sstu.cocktail.Geometry.Fraction.Figure;

import ru.sstu.cocktail.Interfaces.IcanGetPolyline;
import ru.sstu.cocktail.ex_1_1_.Point2D;
import ru.sstu.cocktail.ex_1_3_.Broken;

public class Triangle extends Figure implements IcanGetPolyline {
    protected Point2D b;
    protected Point2D c;

    public Triangle(Point2D a, Point2D b, Point2D c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return Math.abs((origin.x - c.x) * (b.y - c.y) - (origin.y - c.y) * (b.x - c.x)) / 2d;
    }


    @Override
    public Broken getBroken() {
        return new Broken(origin, b, c);
    }
}
