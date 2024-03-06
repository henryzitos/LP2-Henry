import java.util.Scanner;

public class e1019 {
    public static void main (String args[]) {
        int n, h, m, s = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.close();

        h = n /3600;
        m = (n % 3600) / 60;
        s = (n % 3600) % 60;

        System.out.println(h + ":" + m + ":" + s);
    }
}
