//package ru.sstu.cocktail.ex_1_1_;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PointBuilder {
//    public double x;
//    public double y;
//    private static List<MyPoint> points = new ArrayList<MyPoint>();
//    public static void addPoint(MyPoint point) {
//        points.add(point);
//    }
//    public static MyPoint  getPoints  (int index) {
//        return points.get(index);
//    }
//    public static  MyPoint create(double x,double y) {
//        for (MyPoint p : points) {
//
//            if (x == p.getPointX() && y == p.getPointY()) {
//                return p;
//            }
//        }
//        MyPoint p = new MyPoint(x,y);
//        addPoint(p);
//        return p;
//    }
//}
