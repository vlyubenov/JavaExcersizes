package ExtraTasks.P3;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String car = "";
        double price = 0;
        double priceCar = 0;
        String type = "";
        if (budget <= 100) {
            type = "Economy class";
            switch (season) {
                case "Summer":
                    car = "Cabrio";
                    priceCar = 0.35;
                    break;
                case "Winter":
                    car = "Jeep";
                    priceCar = 0.65;
                    break;
            }
        } else if (100 < budget && budget <= 500) {
            type = "Compact class";
            switch (season) {
                case "Summer":
                    car = "Cabrio";
                    priceCar = 0.45;
                    break;
                case "Winter":
                    car = "Jeep";
                    priceCar = 0.80;
                    break;
            }
        } else if (budget > 500) {
            type = "Luxury class";
            switch (season) {
                case "Summer":
                case "Winter":
                    car = "Jeep";
                    priceCar = 0.90;
                    break;
            }
        }
        price = budget * priceCar;
        System.out.printf("%s%n%s - %.2f", type, car, price);
    }
}
