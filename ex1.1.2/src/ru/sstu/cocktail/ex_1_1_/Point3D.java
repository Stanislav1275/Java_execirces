package ru.sstu.cocktail.ex_1_1_;

public class Point3D implements IPoint3D{

    public double z;
    public double x;
    public double y;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D() {
        this(0,0,0);
    }


    public void shiftCoords(double xOffset, double yOffset, double zOffset) {
        this.z += zOffset;
        this.x += zOffset;
        this.y += zOffset;
    }

    @Override
    public String toString() {
        return super.toString().replace("}\n", String.format(";%f}\n",z));
    }
}
