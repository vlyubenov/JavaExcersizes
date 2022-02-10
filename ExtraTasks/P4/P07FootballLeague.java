package ExtraTasks.P4;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        double fens = Integer.parseInt(scanner.nextLine());
        int a = 0;
        int b = 0;
        int v = 0;
        int g = 0;

        for (int i = 0; i < fens; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "V":
                    v++;
                    break;
                case "G":
                    g++;
                    break;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", a / fens * 100, b / fens * 100, v / fens * 100, g / fens * 100, fens / capacity * 100);
    }
}