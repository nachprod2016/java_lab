public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1.1, 1.1);
        Point p2 = new Point(2.2, 2.2);
        System.out.println("Координаты точки p1 на плоскости: " + p1.toString());
        System.out.println("Координаты точки p2 на плоскости: " + p2.toString());
        System.out.println("Расстояние между точками p1 и p2: " + p1.distanceFromOrigin(p2.getX(), p2.getY()));
        Point3D p1_3D = new Point3D(1.1, 1.1, 1.1);
        Point3D p2_3D = new Point3D(2.2, 2.2, 2.2);
        System.out.println("Координаты точки p1 в пространстве: " + p1_3D.toString());
        System.out.println("Координаты точки p2 в пространстве: " + p2_3D.toString());
        System.out.println("Расстояние между точками p1 и p2: " + p1_3D.distanceFromOrigin(p2_3D.getX(), p2_3D.getY(), p2_3D.getZ()));
    }
}