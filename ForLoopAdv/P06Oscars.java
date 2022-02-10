package MainCourse.ForLoopAdv;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double evaluatorPoints = Double.parseDouble(scanner.nextLine());
            int length = name.length();
            academyPoints += length * evaluatorPoints / 2;
            if (academyPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, academyPoints);
                break;
            }
        }
        if (academyPoints <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - academyPoints);
        }
    }
}
