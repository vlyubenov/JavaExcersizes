package MainCourse.WhileLoopExcercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());
        int countBadGr = 0;
        int countAnswers = 0;
        double sumGrades = 0;
        String lastProblem = "";
        boolean isFailed = true;
        while (badGrades > countBadGr) {
            String nameTask = scanner.nextLine();
            if ("Enough".equals(nameTask)) {
                isFailed = false;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade <= 4) {
                countBadGr++;
            }
            countAnswers++;
            sumGrades += grade;
            lastProblem = nameTask;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", sumGrades / countAnswers, countAnswers, lastProblem);
        }
    }
}
