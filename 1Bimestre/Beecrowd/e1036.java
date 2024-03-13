/*
 * Read 3 floating-point numbers. After, print the roots of bhaskara’s formula. If it's impossible to calculate 
 * the roots because a division by zero or a square root of a negative number, presents the message “Impossivel 
 * calcular”.
 */

import java.util.Scanner;
import java.lang.Math;

public class e1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        sc.close();

        delta = Math.pow(b, 2.0) - (4 * a * c);

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if(a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }
    }
}
