/*
 * Make a program that reads a seller's name, his/her fixed salary and the sale's total made by 
 * himself/herself in the month (in money). Considering that this seller receives 15% over all products sold, 
 * write the final salary (total) of this seller at the end of the month , with two decimal places.
 */

import java.util.Scanner;

public class e1009 {
    public static void main(String[] args) {
        String name;
        double salario, totalVendas, total;
        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        salario = sc.nextDouble();
        totalVendas = sc.nextDouble();
        sc.close();

        total = salario + (totalVendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
