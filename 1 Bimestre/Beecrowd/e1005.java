/*
Read two floating points' values of double precision A and B, corresponding to two student's grades. After this, calculate the student's average, 
considering that grade A has weight 3.5 and B has weight 7.5. Each grade can be from zero to ten, always with one digit after the decimal point. 
Don’t forget to print the end of line after the result, otherwise you will receive “Presentation Error”. Don’t forget the space before and after the 
equal sign.
*/

import java.io.IOException;
import java.util.Scanner;

public class e1005 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        double A, B, MEDIA = 0;

        A = sc.nextDouble();
        B = sc.nextDouble();

        MEDIA = (A * 3.5)/11 + (B * 7.5)/11;

        System.out.printf("MEDIA = %.5f\n", MEDIA);

    }
}