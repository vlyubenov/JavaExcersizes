package MainCourse.WhileLoopExcercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stepsS=scanner.nextLine();
        int steps=0;

        while (steps<10000&&!stepsS.equals("Going home")) {
            steps += Integer.parseInt(stepsS);
            if (steps < 10000) {
                stepsS = scanner.nextLine();
            }
        }

        if (stepsS.equals("Going home")){
            stepsS=scanner.nextLine();
            steps+=Integer.parseInt(stepsS);
        }

        boolean isReached=steps>=10000;


        if (isReached){
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!",steps-10000);
        }else {
            System.out.printf("%d more steps to reach goal.",10000-steps);
        }
    }
}
