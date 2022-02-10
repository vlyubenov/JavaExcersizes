package ExtraTasks.P3;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int tulip = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double priceChrysanthemum = 0;
        double priceRose = 0;
        double priceTulip = 0;
        double countFlowers = chrysanthemum + rose + tulip;
        double taxMake = 2;

        switch (season) {
            case "Spring":
            case "Summer":
                priceChrysanthemum = 2.0;
                priceRose = 4.10;
                priceTulip = 2.50;
                break;
            case "Autumn":
            case "Winter":
                priceChrysanthemum = 3.75;
                priceRose = 4.50;
                priceTulip = 4.15;
                break;
        }

        double totalPrice = rose * priceRose + tulip * priceTulip + chrysanthemum * priceChrysanthemum;

        if (holiday.equals("Y")) {
            totalPrice = totalPrice + (totalPrice * 0.15);
        }

        if (tulip > 7 && season.equals("Spring")) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }

        if (rose >= 10 && season.equals("Winter")) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        }

        if (countFlowers > 20) {
            totalPrice = totalPrice - (totalPrice * 0.20);
        }

        totalPrice = taxMake + totalPrice;
        System.out.printf("%.2f", totalPrice);
    }
}