package MainCourse.secondTasks;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holiday = Double.parseDouble(scanner.nextLine());
        int pcsPuzzle = Integer.parseInt(scanner.nextLine());
        int pcsDolls = Integer.parseInt(scanner.nextLine());
        int pcsBears = Integer.parseInt(scanner.nextLine());
        int pcsMinions = Integer.parseInt(scanner.nextLine());
        int pcsTrucks = Integer.parseInt(scanner.nextLine());

        double discount = 0.25;
        double rent = 0.10;

        int countToys = pcsBears+pcsPuzzle+pcsDolls+pcsTrucks+pcsMinions;

        double puzzlePrice = pcsPuzzle * 2.60;
        double DollsPrice= pcsDolls * 3.00;
        double BearsPrice= pcsBears * 4.10;
        double MinionsPrice = pcsMinions * 8.20;
        double TrucksPrice = pcsTrucks * 2.00;

        double middlePrice = puzzlePrice+DollsPrice+BearsPrice+MinionsPrice+TrucksPrice;
        double moneyForHoliday= 0;

        if(countToys>= 50) {
            discount = middlePrice * discount;
            moneyForHoliday=middlePrice-discount;
        }else {
            moneyForHoliday=middlePrice;
        }

        moneyForHoliday=moneyForHoliday-(moneyForHoliday*rent);

        if(moneyForHoliday>=holiday){
            System.out.printf("Yes! %.2f lv left.",(moneyForHoliday-holiday));
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",(holiday-moneyForHoliday));
        }
    }
}
