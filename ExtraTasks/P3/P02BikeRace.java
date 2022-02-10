package ExtraTasks.P3;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniorCyclists = Integer.parseInt(scanner.nextLine());
        int seniorCyclists = Integer.parseInt(scanner.nextLine());
        String roadType = scanner.nextLine();

        double priceJR = 0;
        double priceSR = 0;
        double totalPrice;

        switch (roadType) {
            case "trail":
                priceJR = juniorCyclists * 5.5;
                priceSR = seniorCyclists * 7;
                break;
            case "cross-country":
                if (juniorCyclists + seniorCyclists >= 50) {
                    priceJR = juniorCyclists * (8 - (8 * 0.25));
                    priceSR = seniorCyclists * (9.50 - (9.50 * 0.25));
                } else {
                    priceJR = juniorCyclists * 8;
                    priceSR = seniorCyclists * 9.50;
                }
                break;
            case "downhill":
                priceJR = juniorCyclists * 12.25;
                priceSR = seniorCyclists * 13.75;
                break;
            case "road":
                priceJR = juniorCyclists * 20;
                priceSR = seniorCyclists * 21.50;
                break;
        }

        totalPrice = priceJR + priceSR;
        totalPrice = totalPrice - (totalPrice * 0.05);
        System.out.printf("%.2f", totalPrice);
    }
}
