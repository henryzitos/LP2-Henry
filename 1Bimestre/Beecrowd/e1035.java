/*
 * Read 4 integer values A, B, C and D. Then if B is greater than C and D is greater than A and if the sum 
 * of C and D is greater than the sum of A and B and if C and D were positives values and if A is even, write 
 * the message “Valores aceitos” (Accepted values). Otherwise, write the message “Valores nao aceitos” 
 * (Values not accepted).
 */

import java.util.Scanner;

public class e1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sc.close();

        if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}