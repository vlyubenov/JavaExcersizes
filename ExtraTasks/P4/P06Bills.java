package ExtraTasks.P4;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricityTotal = 0;
        double waterTotal = 0;
        double internetTotal = 0;
        double otherTotal = 0;

        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            electricityTotal += electricity;
            waterTotal += 20;
            internetTotal += 15;
            otherTotal += electricity + 20 + 15 + ((electricity + 20 + 15) * 0.2);
        }

        double avMonth = (electricityTotal + waterTotal + internetTotal + otherTotal) / months;

        System.out.printf("Electricity: %.2f lv%n" +
                "Water: %.2f lv%n" +
                "Internet: %.2f lv%n" +
                "Other: %.2f lv%n" +
                "Average: %.2f lv", electricityTotal, waterTotal, internetTotal, otherTotal, avMonth);
    }
}
