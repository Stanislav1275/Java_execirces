package ru.sstu.cocktail.ex_1_1_;

public class SimplePointFabric {
    public static IPoint2d createPoint(double x, double y) {
        return new Point2D(x, y);
    }
    public static IPoint3D createPoint(double x, double y, double z) {
        return new Point3D(x, y, z);
    }
}
