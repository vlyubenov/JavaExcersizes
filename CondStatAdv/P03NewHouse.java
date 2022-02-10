package MainCourse.CondStatAdv;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        double pcsFlowers = Double.parseDouble(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double discount = 0;
        double price = 0;

        switch (flowerType) {
            case "Roses":
                price = pcsFlowers * 5;
                if (pcsFlowers > 80) {
                    discount = 0.10;
                    price = price-(price * discount);
                }
                break;
            case "Dahlias":
                price = pcsFlowers * 3.8;
                if (pcsFlowers > 90) {
                    discount = 0.15;
                    price = price-(price * discount);
                }
                break;
            case "Tulips":
                price = pcsFlowers * 2.8;
                if (pcsFlowers > 80) {
                    discount = 0.15;
                    price = price-(price * discount);
                }
                break;
            case "Narcissus":
                price = pcsFlowers * 3;
                if (pcsFlowers < 120) {
                    price = price + (price * 0.15);
                }

                break;
            case "Gladiolus":
                price = pcsFlowers * 2.5;
                if (pcsFlowers < 80) {
                    price = price + (price * 0.2);
                    break;
                }
        }
        if (budget>=price) {
            System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.",pcsFlowers,flowerType,budget-price);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",price-budget);
        }
    }
}
