package MainCourse.ForLoopAdv;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tab = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        double fine = 0;
        for (int i = 1; i <= tab; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook":
                    fine += 150;
                    break;
                case "Instagram":
                    fine += 100;
                    break;
                case "Reddit":
                    fine += 50;
                    break;
            }
        }
        if (salary <= fine) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f%n", salary - fine);
        }
    }

}
