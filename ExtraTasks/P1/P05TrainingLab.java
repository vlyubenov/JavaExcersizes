package ExtraTasks.P1;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length=Double.parseDouble(scanner.nextLine());
        double width=Double.parseDouble(scanner.nextLine());

        double lengthCm = length *100;
        double widthCm= width*100;

        widthCm = widthCm - 100;

        double columns= Math.floor(lengthCm/120);

        double rows=Math.floor(widthCm/70);

        double countPlaces= columns*rows-3;

        System.out.printf("%.0f",countPlaces);
    }
}
