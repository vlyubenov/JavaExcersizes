package MainCourse.NestedLoopsExercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String jury = scanner.nextLine();
        String presentation = scanner.nextLine();

        double assessment = 0;
        int countPresent = 0;

        while (!presentation.equals("Finish")) {
            double num = 0;

            for (int i = 1; i <= Integer.parseInt(jury); i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                num += grade;
            }
            double avGrade = num / Integer.parseInt(jury);

            System.out.printf("%s - %.2f.%n", presentation, avGrade);
            assessment += avGrade;
            countPresent++;
            num = 0;
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", assessment / countPresent);
    }
}
