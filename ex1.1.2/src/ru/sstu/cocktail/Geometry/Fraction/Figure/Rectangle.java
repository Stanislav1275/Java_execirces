package ru.sstu.cocktail.Geometry.Fraction.Figure;

import ru.sstu.cocktail.Interfaces.IcanGetPolyline;
import ru.sstu.cocktail.ex_1_1_.Point2D;
import ru.sstu.cocktail.ex_1_3_.Broken;
import ru.sstu.cocktail.ex_1_3_.ClosedBroken;

import java.util.ArrayList;
import java.util.Arrays;

public class Rectangle extends Square implements IcanGetPolyline {
    private double b;

    public Rectangle(Point2D origin, double a, double b) {
        super(origin, a);
        setBPrivate(b);

    }

    public Rectangle(double a, double b) {
        this(new Point2D(0,0), a, b);

    }

    private void setBPrivate(double b) {
        if (b > 0) {
            this.b = b;
        } else throw new IllegalArgumentException("illegal value of a: a must be positive");
    }

    public void setB(double b) {
        setBPrivate(b);
    }
    @Override
    public Broken getBroken() {
        return new ClosedBroken(new ArrayList<Point2D>(Arrays.asList(
                origin,
                new Point2D(origin.x + b, origin.y),
                new Point2D(origin.x + b, origin.y - getA()),
                new Point2D(origin.x, origin.y - getA())
        )));
    }
    @Override
    public double area() {
        return getA() * b;
    }

}
