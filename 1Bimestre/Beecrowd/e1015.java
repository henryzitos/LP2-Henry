/*
 * Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) and 
 * p2 (x2, y2) and calculate the distance between them, showing four decimal places after the comma, 
 * according to the formula:
 */

import java.util.Scanner;
import java.lang.Math;

public class e1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, distancia;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        sc.close();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distancia);
    }
}
