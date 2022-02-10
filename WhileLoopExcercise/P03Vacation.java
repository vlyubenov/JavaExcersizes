package MainCourse.WhileLoopExcercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int daysSpend = 0;
        int days = 0;

        while (moneyNeeded > money && daysSpend < 5) {
            String operation = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            days++;

            switch (operation) {
                case "spend":
                    money -= sum;

                    if (money < 0) {
                        money = 0;
                    }
                    daysSpend++;
                    break;
                case "save":
                    money += sum;
                    daysSpend=0;
                    break;
            }
        }

        if (daysSpend == 5) {
            System.out.printf("You can't save the money.%n%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
