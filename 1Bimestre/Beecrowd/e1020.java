import java.util.Scanner;

public class e1020 {
    public static void main(String[] args) {
        int n, a, m, d = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.close();

        a = n / 365;
        m = (n % 365) / 30;
        d = (n % 365) % 30;

        System.out.println(a + " ano(s)");
        System.out.println(m + " mes(es)");
        System.out.println(d + " dia(s)");
    }
}
