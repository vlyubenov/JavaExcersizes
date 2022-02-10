package ExtraTasks.P3;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String placeType = "";
        String location = "";
        double percent = 0;
        double price = 0;

        switch (season) {
            case "Summer":
                if (budget <= 1000) {
                    placeType = "Camp";
                    location = "Alaska";
                    percent = 0.65;
                } else if (1000 < budget && budget <= 3000) {
                    placeType = "Hut";
                    location = "Alaska";
                    percent = 0.80;
                } else {
                    placeType = "Hotel";
                    location = "Alaska";
                    percent = 0.90;
                }break;
            case "Winter":
                if (budget <= 1000) {
                    placeType = "Camp";
                    location = "Morocco";
                    percent = 0.45;
                } else if (1000 < budget && budget <= 3000) {
                    placeType = "Hut";
                    location = "Morocco";
                    percent = 0.60;
                } else {
                    placeType = "Hotel";
                    location = "Morocco";
                    percent = 0.90;
                }break;
        }
        price =budget * percent;
        System.out.printf("%s - %s - %.2f",location,placeType,price);
    }
}
