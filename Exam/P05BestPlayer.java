package Exam;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int maxGoals = 0;
        String lastPlayer = "";
        while (!name.equals("END") && maxGoals < 10) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxGoals) {
                maxGoals = goals;
                lastPlayer = name;
            }
            if (maxGoals>=10){
                break;
            }
            name = scanner.nextLine();
        }
        if (maxGoals >= 3) {
            System.out.printf("%s is the best player!%nHe has scored %d goals and made a hat-trick !!!", lastPlayer, maxGoals);
        } else {
            System.out.printf("%s is the best player!%nHe has scored %d goals.", lastPlayer, maxGoals);
        }
    }
}
