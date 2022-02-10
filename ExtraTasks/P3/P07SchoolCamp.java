package ExtraTasks.P3;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double priceNight = 0;
        double discount = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "boys":
                    case "girls":
                        priceNight = 9.6;
                        break;
                    case "mixed":
                        priceNight = 10;
                        break;
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "boys":
                    case "girls":
                        priceNight = 7.2;
                        break;
                    case "mixed":
                        priceNight = 9.5;
                        break;
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "boys":
                    case "girls":
                        priceNight = 15;
                        break;
                    case "mixed":
                        priceNight = 20;
                        break;
                }
                break;
        }
        if (students >= 50) {
            discount = 0.50;
        } else if (students >= 20) {
            discount = 0.15;
        } else if (students >= 10) {
            discount = 0.05;
        }
        switch (groupType) {
            case "girls":
                switch (season) {
                    case "Winter":
                        sport = "Gymnastics";
                        break;
                    case "Spring":
                        sport = "Athletics";
                        break;
                    case "Summer":
                        sport = "Volleyball";
                        break;
                }
                break;
            case "boys":
                switch (season) {
                    case "Winter":
                        sport = "Judo";
                        break;
                    case "Spring":
                        sport = "Tennis";
                        break;
                    case "Summer":
                        sport = "Football";
                        break;
                }
                break;
            case "mixed":
                switch (season) {
                    case "Winter":
                        sport = "Ski";
                        break;
                    case "Spring":
                        sport = "Cycling";
                        break;
                    case "Summer":
                        sport = "Swimming";
                        break;
                }
                break;
        }
        double pricePerStudent = priceNight * nights;
        double price = pricePerStudent * students - ((pricePerStudent * students) * discount);
        System.out.printf("%s %.2f lv.", sport, price);
    }
}