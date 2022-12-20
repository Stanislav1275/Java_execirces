package ru.sstu.cocktail.ex_1_1_;

public class Point3D extends Point2D {

    public double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        super(0, 0);
        this.z = 0;
    }

    public void shiftCoords(double xOffset, double yOffset, double zOffset) {
        super.shiftCoords(xOffset, yOffset);
        this.z += zOffset;
    }

    @Override
    public String toString() {
        return super.toString().replace("}\n", String.format(";%f}\n",z));
    }
}
