package ru.sstu.cocktail.ex_1_1_;

import ru.sstu.cocktail.sixHead.Copyable;

import java.util.Objects;

public class Point2D implements Copyable<Point2D>, IPoint2d{

    public double x;
    public double y;
//    private static List<Point> points = new ArrayList<Point>();

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }
    public Point2D(Point2D p){
        this.x = p.x;
        this.y = p.y;
    }
    @Override
    public String toString() {
        return String.format("{%f;%f}\n", x, y);
    }

    public void shiftCoords(double xOffset, double yOffset) {
        this.x += xOffset;
        this.y += yOffset;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return Double.compare(point2D.x, x) == 0 && Double.compare(point2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Point2D clone() {
        try{
            return (Point2D) super.clone();

        }catch(Exception e){
            throw  new RuntimeException(e);
        }
    }


}
