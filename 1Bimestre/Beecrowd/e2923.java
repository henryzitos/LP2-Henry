import java.util.Scanner;

public class e2923 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, a, w, c;

        t = sc.nextInt();
        a = sc.nextInt();
        w = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        // int cemPc = t * 100 / t;
        // int pcEmUso = a * 100 / t;
        // System.out.println("Cem por cento: " + t + " = " + cemPc +"%"+ " Porcentagem em uso: " + a + " = " + pcEmUso +"%"+ " Warning: " + w +"%"+ " Critical: " + c +"%");

        if (a * 100 / t >= w && a * 100 / t < c) {
            System.out.println("warning");
        } else if (a * 100 / t >= c) {
            System.out.println("critical");
        } else {
            System.out.println("OK");
        }
    }
}
