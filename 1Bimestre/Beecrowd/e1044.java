import java.util.Scanner;

public class e1044 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
