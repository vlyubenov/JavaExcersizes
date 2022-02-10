package MainCourse.WhileLoopExcercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int space = width * length * height;

        while (space >= 0) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            int boxTake = Integer.parseInt(input);
            space -= boxTake;
        }

        if (space >= 0) {
            System.out.printf("%d Cubic meters left.", space);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
        }
    }
}
