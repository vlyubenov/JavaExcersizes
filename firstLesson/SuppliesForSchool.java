import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaningGel = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double sumPens = pens * 5.80;
        double sumMarkers = markers * 7.20;
        double sumCleaning = cleaningGel * 1.20;
        double sum = sumPens + sumMarkers + sumCleaning;
        double finalPrice = sum - (sum *(percent/100));

        System.out.println(finalPrice);
    }
}
