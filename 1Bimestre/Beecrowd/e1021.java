/*
 * Read a value of floating point with two decimal places. This represents a monetary value. After this, 
 * calculate the smallest possible number of notes and coins on which the value can be decomposed. The
 * considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 
 * 0.01. Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by 
 * the list of coins.
 */

import java.util.Scanner;

public class e1021 {
    public static void main(String[] args) {
        double dinheiro;
        int n100, n50, n20, n10, n5, n2, m1, m50, m25, m10, m5, m01;
        Scanner sc = new Scanner(System.in);

        dinheiro = sc.nextDouble();
        sc.close();

        /*
        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00"); 
        */
    }
}
