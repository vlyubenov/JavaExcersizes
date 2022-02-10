package ExtraTasks.P2;

import java.util.Scanner;

public class P07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mongolia = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double price = mongolia * 3.25 + hyacinths * 4 + rose * 3.5 + cactus * 8;
        double totalPrice = price - (0.05 * price);

        if (totalPrice >= priceGift) {
            System.out.printf("She is left with %.0f leva.", Math.floor(totalPrice - priceGift));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(priceGift - totalPrice));
        }


    }
}
