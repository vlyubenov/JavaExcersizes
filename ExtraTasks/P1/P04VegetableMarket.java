package ExtraTasks.P1;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegesPrice= Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        double kgVegFull=Double.parseDouble(scanner.nextLine());
        double kgFruitFull=Double.parseDouble(scanner.nextLine());
        double lv=1;
        double euro=1.94*lv;

        double sumLv= vegesPrice*kgVegFull + fruitPrice*kgFruitFull;
        double totalPriceEuro= sumLv/euro;

        System.out.printf("%.2f",totalPriceEuro);



    }
}
