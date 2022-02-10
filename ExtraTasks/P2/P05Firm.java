package ExtraTasks.P2;

import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hour = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());
        int staff = Integer.parseInt(scanner.nextLine());

        double workingH = (days - days * 0.1) * 8;
        double workingOverTime = staff * (2 * days);
        double totalWork = Math.floor(workingH + workingOverTime);
        if (hour <= totalWork) {
            System.out.printf("Yes!%.0f hours left.", totalWork - hour);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hour - totalWork);
        }
    }
}
