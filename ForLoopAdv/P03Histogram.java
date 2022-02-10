package MainCourse.ForLoopAdv;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double countN200 = 0;
        double countN400 = 0;
        double countN600 = 0;
        double countN800 = 0;
        double countNMax = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 200) {
                countN200++;
            } else if (num < 400) {
                countN400++;
            } else if (num < 600) {
                countN600++;
            } else if (num < 800) {
                countN800++;
            } else {
                countNMax++;
            }
        }
        double p1 = countN200 / n * 100;
        double p2 = countN400 / n * 100;
        double p3 = countN600 / n * 100;
        double p4 = countN800 / n * 100;
        double p5 = countNMax / n * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", p1, p2, p3, p4, p5);
    }
}
