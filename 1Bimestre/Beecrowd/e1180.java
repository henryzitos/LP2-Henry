import java.util.Scanner;

public class e1180 {
    public static void main(String[] args) {
        int[] x;
        int n, m, p = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        x = new int[n];

        for (int index = 0; index < x.length; index++) {
            x[index] = sc.nextInt();
        }
        sc.close();

        m = x[0];

        for (int index = 0; index < x.length; index++) {
            if (x[index] < m){
                m = x[index];
                p = index;
            }
        }

        System.out.println("Menor valor: " + m);
        System.out.println("Posicao: " + p);
    }
}
