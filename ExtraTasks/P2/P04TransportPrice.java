package ExtraTasks.P2;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        String travelType = scanner.nextLine();

        double taxiPrice = 0;
        double busPrice = 0.09 * n;
        double trainPrice = 0.06 * n;

        switch (travelType) {
            case "day":
                taxiPrice = 0.7 + 0.79 * n;
                break;
            case "night":
                taxiPrice = 0.7 + 0.90 * n;
                break;
        }

        if (n < 20) {
            System.out.printf("%.2f", taxiPrice);
        } else if (n < 100) {
            System.out.printf("%.2f", Math.min(taxiPrice, busPrice));
        } else {
            if (taxiPrice > busPrice) {
                System.out.printf("%.2f", Math.min(busPrice, trainPrice));
            } else {
                System.out.printf("%.2f", Math.min(taxiPrice, trainPrice));
            }
        }
    }
}
