import java.util.Scanner;

public class e1010 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int p1 = sc.nextInt();
        int u1 = sc.nextInt();
        double v1 = sc.nextDouble();

        int p2 = sc.nextInt();
        int u2 = sc.nextInt();
        double v2 = sc.nextDouble();

        sc.close();

        double total = (u1 * v1) + (u2 * v2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
