package MainCourse.ForLoopAdv;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int pointsRanklist = Integer.parseInt(scanner.nextLine());
        int tournamentsPoints = 0;
        double countW = 0;
        for (int i = 0; i < tournaments; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    tournamentsPoints += 2000;
                    countW++;
                    break;
                case "F":
                    tournamentsPoints += 1200;
                    break;
                case "SF":
                    tournamentsPoints += 720;
                    break;
            }
        }
        int averageP = tournamentsPoints / tournaments;
        double winPercent = countW / tournaments * 100;
        System.out.printf("Final points: %d%nAverage points: %d%n%.2f%%", pointsRanklist + tournamentsPoints, averageP, winPercent);
    }
}
