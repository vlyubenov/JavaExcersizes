package MainCourse.CondStatAdv;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArriving = Integer.parseInt(scanner.nextLine());
        int minArriving = Integer.parseInt(scanner.nextLine());

        double minsExam = hourExam * 60 + minExam;
        double minsArriving = hourArriving * 60 + minArriving;
        double difference = Math.abs(minsExam - minsArriving);
        double hour = Math.floor(difference / 60);
        double minutes = difference % 60;

        if (minsArriving <= minsExam && minsArriving >= minsExam - 30) {
            System.out.printf("On time%n%.0f minutes before the start", minsExam - minsArriving);
        } else if (minsArriving < minsExam - 30) {
            if (difference < 60) {
                System.out.printf("Early%n%.0f minutes before the start", minsExam - minsArriving);
            } else {
                if (minutes < 10) {
                    System.out.printf("Early%n%.0f:0%.0f hours before the start", hour, minutes);
                } else {
                    System.out.printf("Early%n%.0f:%.0f hours before the start", hour, minutes);
                }
            }
        } else {
            if (difference < 60&&hour==0) {
                System.out.printf("Late%n%.0f minutes after the start", minsArriving - minsExam);
            } else {
                if (minutes < 10) {
                    System.out.printf("Late%n%.0f:0%.0f hours after the start", hour, minutes);
                } else {
                    System.out.printf("Late%n%.0f:%.0f hours after the start", hour, minutes);
                }
            }

        }
    }
}
