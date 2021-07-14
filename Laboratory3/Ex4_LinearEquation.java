/*
Design a class named LinearEquation for a system of 2 x 2 linear equations:
ax+by=e , cx+dy=f , x=(e*d) - (b*f)) / ((a*d) - (b*c), y=(a*f) - (e*c)) / ((a*d) - (b*c)
The class contains:
• Private attributes a, b, c, d, e, and f.
• A constructor with the arguments for a, b, c, d, e, and f.
• Six get methods for a, b, c, d, e, and f.
• A method isSolvable() that returns true if (ad – bc) is not 0 and false otherwise.
• Methods getX() and getY() that return the solution for the equation.
Draw a class diagram for this class and then implement the class. Write a test program
that prompts the user to enter a, b, c, d, e, and f then displays the solution. If (ad – bc) is
0, report that "The equation has no solution."
 */
package Laboratory3;

import java.util.Scanner;

public class Ex4_LinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c,d,e,f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        cal equation = new cal(a,b,c,d,e,f);
        double x = equation.getX();
        double y = equation.getY();
        if(equation.isSolvable()){
            System.out.println("X: " + x + " " + "Y:" + y);
        }
        System.out.println("The equation has no equation");
    }

    public static class cal {
        private double a;
        private double b;
        private double c;
        private double d;
        private double e;
        private double f;

        public cal(double a, double b, double c, double d, double e, double f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }

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

        public double getD() {
            return d;
        }

        public void setD(double d) {
            this.d = d;
        }

        public double getE() {
            return e;
        }

        public void setE(double e) {
            this.e = e;
        }

        public double getF() {
            return f;
        }

        public void setF(double f) {
            this.f = f;
        }

        public boolean isSolvable() {
            return a * d - b * c != 0;
        }

        public double getX() {
            return ((e*d) - (b*f)) / ((a*d) - (b*c));
        }
        public double getY() {
            return ((a*f) - (e*c)) / ((a*d) - (b*c));
        }
    }
}


