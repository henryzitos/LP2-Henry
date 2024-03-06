import java.io.IOException;
import java.util.Scanner;
 
public class e1001 {
    public static void main(String[] args) throws IOException {
        int A, B, X = 0;
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        B = sc.nextInt();
        
        sc.close();

        X = A + B;
        System.out.println("X = " + X);
    }
}