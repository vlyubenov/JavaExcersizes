package ExtraTasks.P1;

import java.util.Scanner;

public class P03CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees=Double.parseDouble(scanner.nextLine());

        double F=degrees*9/5+32;
        System.out.printf("%.2f",F);
    }
}
