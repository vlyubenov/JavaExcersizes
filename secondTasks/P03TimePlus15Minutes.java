package MainCourse.secondTasks;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes=minutes+15;

        if (minutes>=60){
            hour = hour+1;
            minutes= minutes - 60;
        }if (hour==24){
            hour=00;
        }if (minutes<10) {
            System.out.printf("%d:0%d", hour,minutes);
        }else {
            System.out.printf("%d:%d",hour,minutes);
        }

    }
}
