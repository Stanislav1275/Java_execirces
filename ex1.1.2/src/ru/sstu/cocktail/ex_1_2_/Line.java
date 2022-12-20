package ru.sstu.cocktail.ex_1_2_;

import ru.sstu.cocktail.Interfaces.IcanGetPolyline;
import ru.sstu.cocktail.Interfaces.Longable;

import ru.sstu.cocktail.ex_1_1_.Point2D;
import ru.sstu.cocktail.ex_1_3_.Broken;

import java.util.Objects;

public class Line implements Longable, IcanGetPolyline {
    protected Point2D point1;
    protected Point2D point2;

    public Line(double x1, double y1, double x2, double y2) {
        this(new Point2D(x1, y1), new Point2D(x2, y2));
    }

    public Line(Point2D p1, Point2D p2) {
        this.point1 = p1;
        this.point2 = p2;
    }
    public Line(Line line) throws CloneNotSupportedException {
        this.point1 = line.getStart().clone();
        this.point1 = line.getEnd().clone();
    }
    public Point2D getStart() {

        return point1;
    }

    public Point2D getEnd() {
        return point2;
    }

    @Override
    public String toString() {
        return String.format("Line from %s to %s\n", point1, point2);
    }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
//        if (!(o instanceof Line line)) return false;
        Line line = (Line)o;
        return point1.equals(line.point1) && point2.equals(line.point2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point1, point2);
    }

    @Override
    public Broken getBroken() {
        return new Broken(point1, point2);
    }
}
