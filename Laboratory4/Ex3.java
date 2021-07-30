package Laboratory4;
public class Ex3{
    public static void main(String[] args) {
        B b = new B(2,4);
        System.out.println(b.getArea());
    }
}
class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
class B extends Circle {
    private double length;

    B(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double getArea() {
        return super.getArea() * length;
    }
}
