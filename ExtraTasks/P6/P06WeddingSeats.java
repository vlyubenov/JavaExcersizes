package ExtraTasks.P6;

import java.util.Scanner;

public class P06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int rows = Integer.parseInt(scanner.nextLine());
        int placeX = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (char i = 'A'; i <= lastSector; i++) {

            for (int j = 1; j <= rows; j++) {
                if (j % 2 != 0) {

                    for (char k = 'a'; k < 'a' + placeX; k++) {
                        System.out.printf("%s%d%s%n", i, j, k);
                        count++;
                    }
                } else {

                    for (char k = 'a'; k < 'a' + (2 + placeX); k++) {
                        System.out.printf("%s%d%s%n", i, j, k);
                        count++;
                    }
                }
            }
            rows++;
        }
        System.out.println(count);
    }
}