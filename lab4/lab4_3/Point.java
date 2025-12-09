public class Point {

    protected double x;
    protected double y;
    
    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + String.valueOf(x) + ", " + String.valueOf(y) + ")";
    }

    public double distanceFromOrigin(double x1, double y1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    }

    boolean isInRectangle(double top, double left, double bottom, double right) {
        return x > left && x < right && y < top && y > bottom;
    }

    boolean isInCircle(double x_center, double y_center, double radius) {
        return distanceFromOrigin(x_center, y_center) < radius;
    }
}
