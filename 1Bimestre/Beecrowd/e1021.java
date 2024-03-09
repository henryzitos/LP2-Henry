import java.util.Scanner;

public class e1021 {
    public static void main(String[] args) {
        double dinheiro;
        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};
        Scanner sc = new Scanner(System.in);

        dinheiro = sc.nextDouble();
        sc.close();
        int valorCerto = (int) (dinheiro * 100);

        System.out.println("NOTAS:"); 
        for (int nota : notas) { 
            int quantidadeNotas = valorCerto / nota; 
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, (double) nota / 100); 
            valorCerto %= nota; 
        }

        System.out.println("MOEDAS:"); 
        for (int moeda : moedas) { 
            int quantidadeMoedas = valorCerto / moeda; 
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, (double) moeda / 100); 
            valorCerto %= moeda; 
        }

        /* System.out.println("NOTAS:");
        for (int n : notas) {
            System.out.printf("%d nota(s) de R$ %d.00\n", (int) dinheiro / n, n);
            dinheiro %= n;
        }

        System.out.println("MOEDAS:");
        for (double m : moedas) {
            System.out.printf("%d moeda(s) de R$ %.2f\n", (int) (dinheiro / m), m);
            dinheiro %= m;
        } */
    }
}
