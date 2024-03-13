import java.util.Scanner;

public class e1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sc.close();

        diferenca = (a * b - c * d);
        System.out.printf("DIFERENCA = %d\n", diferenca);
    }
}
