package MainCourse.ForLoopAdv;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        double Musala = 0;
        double Monblan = 0;
        double Kilimandjaro = 0;
        double K2 = 0;
        double Everest = 0;

        for (int i = 0; i < groups; i++) {
            int group = Integer.parseInt(scanner.nextLine());
            if (group <= 5) {
                Musala += group;
            } else if (group <= 12) {
                Monblan += group;
            } else if (group <= 25) {
                Kilimandjaro += group;
            } else if (group <= 40) {
                K2 += group;
            } else {
                Everest += group;
            }
        }
        double totalPeople = Musala + Monblan + Kilimandjaro + K2 + Everest;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", Musala / totalPeople * 100, Monblan / totalPeople * 100, Kilimandjaro / totalPeople * 100, K2 / totalPeople * 100, Everest / totalPeople * 100);
    }
}
