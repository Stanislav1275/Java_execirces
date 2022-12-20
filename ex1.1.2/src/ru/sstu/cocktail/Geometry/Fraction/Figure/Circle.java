package ru.sstu.cocktail.Geometry.Fraction.Figure;

import ru.sstu.cocktail.ex_1_1_.Point2D;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Point2D center) {
        super(center);
        radius(radius);
    }


    public Circle(double radius) {
        super();
        radius(radius);
    }

    public double radius() {
        return radius;
    }

    public void radius(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Invalid radius");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}