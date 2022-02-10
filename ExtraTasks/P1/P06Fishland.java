package ExtraTasks.P1;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSkmr= Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi = Double.parseDouble(scanner.nextLine());

        double pricePalamud= priceSkmr+(priceSkmr*0.6);
        double priceSafrid= priceCaca+(priceCaca*0.8);
        double priceMidi=7.50;

        double totalSum=kgPalamud*pricePalamud+kgSafrid*priceSafrid+kgMidi*priceMidi;
        System.out.printf("%.2f",totalSum);
    }
}
