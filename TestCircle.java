package Java_18;

import Java_18.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Cylinder(1.1, 2.2);
        System.out.println(c1);
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());
        System.out.println(c1.getArea());

        Circle c2 = new Circle(1.1);
        Cylinder cy1 = new Cylinder(2.2, 3.3);
        System.out.println(c2 instanceof Circle);
        System.out.println(c2 instanceof Cylinder);
        System.out.println(cy1 instanceof Circle);
        System.out.println(cy1 instanceof Cylinder);

        Circle c3 = new Cylinder(4.4, 5.5);
        System.out.println(c3 instanceof Circle);
        System.out.println(c3 instanceof Cylinder);
    }
}
