package MainCourse.WhileLoop;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double assessment = 0;
        int grade = 1;
        int strikes = 0;

        while (grade <= 12 && strikes < 2) {
            double assessmentC = Double.parseDouble(scanner.nextLine());
            if (assessmentC >= 4) {
                grade++;
                assessment += assessmentC;
            } else {
                strikes++;
            }
        }

        if (strikes == 2) {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        } else
            System.out.printf("%s graduated. Average grade: %.2f", name, assessment / (grade - 1));
    }
}
