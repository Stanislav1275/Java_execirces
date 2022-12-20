package ru.sstu.cocktail.Square;

import ru.sstu.cocktail.ex_1_1_.MyPoint;
import ru.sstu.cocktail.ex_1_3_.Polyline;

public class Square {
    private MyPoint p1;
    private Polyline square;
    private double a;

    public Square(MyPoint p1, double a) {
        this.p1 = p1;
        setAPrivate(a);
        setPolyline();

    }

    public Square(double x, double y, double a) {
        this(MyPoint.create(x, y), a);
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public double getA() {
        return a;
    }

    private void setPolyline() {
        square = new Polyline(
                p1,
                MyPoint.create(p1.getPointX() + a, p1.getPointY()),
                MyPoint.create(p1.getPointX() + a, p1.getPointY() - a),
                MyPoint.create(p1.getPointX(), p1.getPointY() - a)
        );
    }

    public Polyline getSquare() {
        return square;
    }

    private void setAPublic(double a) {
        if (a > 0) {
            this.a = a;
            setPolyline();
        } else throw new IllegalArgumentException("illegal value of a: a must be positive");
    }
    public void setAPrivate(double a){
        setAPublic(a);
    }
    @Override
    public String toString() {
        return "Square{" +
                "p1=" + p1 +
                ", square=" + square +
                '}';
    }
}
