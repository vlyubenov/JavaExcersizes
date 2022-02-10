package ExtraTasks.P2;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restDays=Integer.parseInt(scanner.nextLine());

        double norm=30000;
        double workDaysPlay= (365-restDays)*63;
        double restDaysPlay= restDays*127;
        double totalGame= workDaysPlay+restDaysPlay;

        if (norm>totalGame){
            double difference=norm-totalGame;
            double H = Math.floor(difference/60);
            double M= difference%60;
            System.out.printf("Tom sleeps well%n%.0f hours and %.0f minutes less for play",H,M);
        }else {
            double difference=totalGame-norm;
            double H = Math.floor(difference/60);
            double M= difference%60;
            System.out.printf("Tom will run away%n%.0f hours and %.0f minutes more for play",H,M);
        }
    }
}
