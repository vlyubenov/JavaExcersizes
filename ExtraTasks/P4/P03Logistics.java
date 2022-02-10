package ExtraTasks.P4;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double priceVan = 0;
        double priceTruck = 0;
        double priceTrain = 0;
        double tonTotal = 0;

        int tonVan = 0;
        int tonTruck = 0;
        int tonTrain = 0;

        for (int i = 0; i < n; i++) {
            double tons = Double.parseDouble(scanner.nextLine());
            tonTotal += tons;
            if (tons <= 3) {
                priceVan += tons * 200;
                tonVan += tons;
            } else if (tons <= 11) {
                priceTruck += tons * 175;
                tonTruck += tons;
            } else {
                priceTrain += tons * 120;
                tonTrain += tons;
            }
        }

        double totalPrice = priceTrain + priceTruck + priceVan;
        double avPriceTon = totalPrice / tonTotal;

        System.out.printf("%.2f%n%.2f%%%n%.2f%%%n%.2f%%", avPriceTon, tonVan / tonTotal * 100, tonTruck / tonTotal * 100, tonTrain / tonTotal * 100);
    }
}
