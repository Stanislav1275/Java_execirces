package ru.sstu.cocktail.Geometry.Fraction.Figure;

import ru.sstu.cocktail.Interfaces.IcanGetPolyline;
import ru.sstu.cocktail.Interfaces.Longable;
import ru.sstu.cocktail.ex_1_1_.Point2D;
import ru.sstu.cocktail.ex_1_3_.Broken;
import ru.sstu.cocktail.ex_1_3_.ClosedBroken;

import java.util.ArrayList;
import java.util.Arrays;

public class Square extends Figure  implements IcanGetPolyline, Longable {
    private double a;

    public Square(Point2D origin, double a) {
        super(origin);
        setAPrivate(a);
    }

    public Square(double a) {
        super();
        setAPrivate(a);
    }



    public void setOrigin(Point2D origin) {
        this.origin = origin;
    }

    public double getA() {
        return a;
    }
    @Override
    public Broken getBroken() {
        return new ClosedBroken(new ArrayList<Point2D>(Arrays.asList(
                origin,
                new Point2D(origin.x + a, origin.y),
                new Point2D(origin.x + a, origin.y - a),
                new Point2D(origin.x, origin.y - a)
        )));
    }
    private void setAPrivate(double a) {
        if (a > 0) {
            this.a = a;
        } else throw new IllegalArgumentException("illegal value of a: a must be positive");
    }

    public void setA(double a) {
        setAPrivate(a);
    }

    @Override
    public double area() {
        return a * a;
    }



    @Override
    public String toString() {
        return "Square{" +
                "leftUpPoint=" + origin +
                ", square=" + getBroken() +
                '}';
    }

    @Override
    public double getLength() {
        return getBroken().getLength();
    }
}
