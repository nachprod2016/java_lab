public class Point3D extends Point{
    double z;
    
    public Point3D () {
        super();
        z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);        
        this.z = z;
    }

    public void setLocation(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + String.valueOf(x) + ", " + String.valueOf(y) + ", " + String.valueOf(z) + ")";
    }

    public double distanceFromOrigin(double x1, double y1, double z1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1) + (z - z1) * (z - z1));
    }

    boolean isInBox(double top, double left, double bottom, double right) {
        return x > left && x < right && y < top && y > bottom;
    }

    boolean isInSphere(double x_center, double y_center, double z_center, double radius) {
        return distanceFromOrigin(x_center, y_center, z_center) < radius;
    }
}
