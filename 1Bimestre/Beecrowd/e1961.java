import java.util.Scanner;

public class e1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pn;
        int p, n;

        p = sc.nextInt();
        n = sc.nextInt();
        pn = new int[n];

        for (int index = 0; index < pn.length; index++) {
            pn[index] = sc.nextInt();
        }
        sc.close();

        for (int index = 0; index < pn.length - 1; index++) {
            //se o tamanho do pulo for maior que a diferença entre os canos
            if (Math.abs(pn[index] - pn[index + 1]) > p) {
                System.out.println("GAME OVER");
                return;
            }
        }

        System.out.println("YOU WIN");
    }
}
