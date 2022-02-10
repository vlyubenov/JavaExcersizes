package ExtraTasks.P2;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double X = Double.parseDouble(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        double Z = Double.parseDouble(scanner.nextLine());
        int staff = Integer.parseInt(scanner.nextLine());

        double grape=X*Y;
        double vine= (grape*0.4)/2.5;

        if (vine>=Z){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person."
                               ,Math.floor(vine),Math.ceil(vine-Z),Math.ceil((vine-Z)/staff));
        }else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(Z-vine));
        }
    }
}