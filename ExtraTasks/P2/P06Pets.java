package ExtraTasks.P2;

import java.util.Scanner;

public class P06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double leftFood = Double.parseDouble(scanner.nextLine());
        double foodDog = Double.parseDouble(scanner.nextLine());
        double foodCat = Double.parseDouble(scanner.nextLine());
        double foodTurtle = Double.parseDouble(scanner.nextLine());

        double totalFood = foodDog + foodCat + (foodTurtle / 1000);
        totalFood = totalFood * days;
        if (leftFood >= totalFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(leftFood - totalFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood - leftFood));
        }
    }
}
