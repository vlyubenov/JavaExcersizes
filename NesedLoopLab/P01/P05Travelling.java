package MainCourse.NesedLoopLab.P01;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        if (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double moneyHoliday = 0;

            while (moneyHoliday < budget && !destination.equals("End")) {
                moneyHoliday += Double.parseDouble(scanner.nextLine());
                if (moneyHoliday >= budget) {
                    System.out.printf("Going to %s!%n", destination);
                    destination = scanner.nextLine();
                    if (destination.equals("End")) {
                        break;
                    }
                    budget = Double.parseDouble(scanner.nextLine());
                    moneyHoliday = 0;
                }
            }
        }
    }
}
