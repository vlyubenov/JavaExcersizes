package MainCourse.secondTasks;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name=scanner.nextLine();
        int lengthMovie=Integer.parseInt(scanner.nextLine());
        double lengthBreak=Double.parseDouble(scanner.nextLine());

        double lengthLunch= lengthBreak * 1/8;
        double lengthChill= lengthBreak/4;
        double leftTime= lengthBreak-(lengthLunch+lengthChill);

        if (leftTime>=lengthMovie){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",name,Math.ceil(leftTime-lengthMovie));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",name,Math.ceil(lengthMovie-leftTime));
        }
    }
}
