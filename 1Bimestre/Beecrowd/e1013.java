import java.util.Scanner;

public class e1013 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, maiorAB, maiorABC;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        sc.close();

        maiorAB = (A + B + Math.abs(A - B)) / 2;

        if(maiorAB > C)
            maiorABC = maiorAB;
        else
            maiorABC = C;
        
        System.out.println(maiorABC + " eh o maior");
    }
}
