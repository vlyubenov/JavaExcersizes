package ExtraTasks.P2;

import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double litFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double price = 0;
        switch (clubCard) {
            case "No":
                switch (fuelType) {
                    case "Gas":
                        price = litFuel * 0.93;
                        break;
                    case "Gasoline":
                        price = litFuel * 2.22;
                        break;
                    case "Diesel":
                        price = litFuel * 2.33;
                        break;
                }
                break;
            case "Yes":
                switch (fuelType) {
                    case "Gas":
                        price = litFuel * 0.85;
                        break;
                    case "Gasoline":
                        price = litFuel * 2.04;
                        break;
                    case "Diesel":
                        price = litFuel * 2.21;
                        break;
                }
                break;

        }
        if (litFuel >= 20 && litFuel <= 25) {
            price = price - (price * 0.08);
        } else if (litFuel > 25) {
            price = price - (price * 0.1);
        }

        System.out.printf("%.2f lv.", price);
    }
}