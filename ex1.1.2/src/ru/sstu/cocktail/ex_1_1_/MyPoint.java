package ru.sstu.cocktail.ex_1_1_;

import java.util.ArrayList;
import java.util.List;

public class MyPoint {

    private double x;
    private double y;
    private static List<MyPoint> points = new ArrayList<MyPoint>();

    private MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("{%f;%f}", x, y);
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftCoords(double xOffset, double yOffset) {

        this.x += xOffset;
        this.y += yOffset;
    }

    public double getPointX() {
        return this.x;
    }

    ;

    public double getPointY() {
        return this.y;
    }



    public static void addPoint(MyPoint point) {
        points.add(point);
    }
    public static MyPoint  getPoints  (int index) {
        return points.get(index);
    }
    public static  MyPoint create(double x,double y) {
        for (MyPoint p : points) {

            if (x == p.getPointX() && y == p.getPointY()) {
                return p;
            }
        }
        MyPoint p = new MyPoint(x,y);
        addPoint(p);
        return p;
    }

}
