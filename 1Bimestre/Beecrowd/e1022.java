
/*
You were invited to do a little job for your Mathematic teacher. The job is to read a Mathematic expression in 
format of two rational numbers (numerator / denominator) and present the result of the operation. Each operand 
or operator is separated by a blank space. The input sequence (each line) must respect the following format: 
number, (‘/’ char), number, operation char (‘/’, ‘*’, ‘+’, ‘-‘), number, (‘/’ char), number. The answer must 
be presented followed by ‘=’ operator and the simplified answer. If the answer can’t be simplified, it must be 
repeated after a ‘=’ operator.

Considering N1 and D1 as numerator and denominator of the first fraction, follow the orientation about how to 
do each one of these 4 operations:

Sum: (N1*D2 + N2*D1) / (D1*D2)
Subtraction: (N1*D2 - N2*D1) / (D1*D2)
Multiplication: (N1*N2) / (D1*D2)
Division: (N1/D1) / (N2/D2), that means (N1*D2)/(N2*D1)

*/
import java.util.Scanner;

public class e1022 {
    public static void main(String[] args) {
        int n1, d1, n2, d2, q;
        Scanner sc = new Scanner(System.in);

        q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            n1 = sc.nextInt();
            sc.next();
            d1 = sc.nextInt();
            char op = sc.next().charAt(0);
            n2 = sc.nextInt();
            sc.next();
            d2 = sc.nextInt();

            switch (op) {
                case '+':
                    int soma1 = (n1 * d2 + n2 * d1);
                    int soma2 = (d1 * d2);
                    System.out.print(soma1 + "/" + soma2 + " = ");
                    simplificador(soma1, soma2);
                    break;
                case '-':
                    int sub1 = (n1 * d2 - n2 * d1);
                    int sub2 = (d1 * d2);
                    System.out.print(sub1 + "/" + sub2 + " = ");
                    simplificador(sub1, sub2);
                    break;
                case '*':
                    int mult1 = (n1 * n2);
                    int mult2 = (d1 * d2);
                    System.out.print(mult1 + "/" + mult2 + " = ");
                    simplificador(mult1, mult2);
                    break;
                case '/':
                    int div1 = (n1 * d2);
                    int div2 = (n2 * d1);
                    System.out.print(div1 + "/" + div2 + " = ");
                    simplificador(div1, div2);
                    break;
            }
        }
        sc.close();
    }

    public static void simplificador(int n1, int n2) {
        int gcd = gcd(Math.abs(n1), Math.abs(n2));
        n1 /= gcd;
        n2 /= gcd;
        System.out.println(n1 + "/" + n2);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
