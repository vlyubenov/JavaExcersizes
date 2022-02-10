import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sumNylon = (nylon + 2) * 1.5;
        double sumPaint = (paint + (paint * 0.1)) * 14.50;
        double sumRazred =razreditel * 5.00;

        double sumMaterials = sumNylon + sumPaint + sumRazred + 0.40;
        double sumPainters = (sumMaterials * 0.3)* hours;
        double finalPrice = sumMaterials + sumPainters;

        System.out.println(finalPrice);
    }
    }
