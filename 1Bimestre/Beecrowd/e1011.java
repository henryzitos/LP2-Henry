import java.util.Scanner;

public class e1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        double r = sc.nextDouble();
        sc.close();

        double volume = (4.0 / 3.0) * pi * Math.pow(r, 3);
        
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
