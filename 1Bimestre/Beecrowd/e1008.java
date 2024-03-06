import java.util.Scanner;

public class e1008 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();

        sc.close();

        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f\n", b * c);
    }
}
