package Laboratory3;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    //Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Getters and setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //Get Discriminant
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    //Get roots
    public double getRoot1() {
        return getDiscriminant() < 0 ? 0 :
                ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
    public double getRoot2() {
        return getDiscriminant() < 0 ? 0 :
                ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
}
