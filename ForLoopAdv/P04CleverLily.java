package MainCourse.ForLoopAdv;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double money = 0;
        double nMoney = 10;
        int toy = 0;
        int countMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += nMoney;
                nMoney += 10;
                countMoney++;
            } else {
                toy++;
            }
        }

        priceToy = priceToy * toy;
        money = money - countMoney;
        double sum = priceToy + money;

        if (sum >= price) {
            System.out.printf("Yes! %.2f", sum - price);
        } else {
            System.out.printf("No! %.2f", price - sum);
        }
    }
}