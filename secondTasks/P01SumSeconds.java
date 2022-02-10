package MainCourse.secondTasks;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int fTime= Integer.parseInt(scanner.nextLine());
     int sTime= Integer.parseInt(scanner.nextLine());
     int tTime= Integer.parseInt(scanner.nextLine());
     int totalTime = fTime+sTime+tTime;
     int minutes = totalTime/60;
     int seconds = totalTime%60;

        if (seconds<10) {
            System.out.printf("%d:0%d", minutes,seconds);
        }else {
            System.out.printf("%d:%d",minutes,seconds);
        }

    }
}
