package MainCourse.firstSteps;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDogs = Integer.parseInt(scanner.nextLine());
        int countCats = Integer.parseInt(scanner.nextLine());

        double priceDogs = countDogs * 2.5;
        double priceCats = countCats * 4.0;

        double totalPrice = priceDogs + priceCats;

        System.out.printf("%.1f lv.", totalPrice);
    }
}
