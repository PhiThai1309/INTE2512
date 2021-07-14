/*
Design a class named QuadraticEquation for a quadratic equation ax2 + bx + c = 0. The
class contains:
• Private attributes a, b, c that represent three coefficients.
• A constructor with the arguments for a, b, and c.
• Three get methods for a, b, c.
• A method getDiscriminant() that return the discriminant b^2 – 4ac.
• Methods getRoot1() and getRoot2() for returning two roots of the equation
These methods are useful only if the discriminant is non negative. Let these
methods return 0 if the discriminant is negative.
Draw a class diagram for this class and then implement the class. Write a test program
that prompts the user to enter values for a, b then displays the result based on the
discriminant. If the discriminant is positive, display two roots. If the discriminant is 0,
display one root. Otherwise, display "The equation has no roots."
 */
package Laboratory3.Ex3;

import java.util.Scanner;

public class Ex3_DisplayDiscriminant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for A: ");
        double a = input.nextDouble();
        System.out.println("Enter the value for B: ");
        double b = input.nextDouble();
        System.out.println("Enter the value for C: ");
        double c = input.nextDouble();

        Ex3_QuadraticEquation equation = new Ex3_QuadraticEquation(a,b,c);
        double discriminant = equation.getDiscriminant();

        if(discriminant > 0) {
            System.out.println("The roots are " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The root is " + equation.getRoot1());
        } else if (discriminant < 0) {
            System.out.println("The equation has no roots");
        }
    }
}



