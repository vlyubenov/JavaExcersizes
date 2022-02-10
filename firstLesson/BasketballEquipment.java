import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double taxYear = Double.parseDouble(scanner.nextLine());

        double sneakers = taxYear - (taxYear * 40/100);
        double outfit = sneakers - (sneakers*20/100);
        double ball = outfit*1/4;
        double accessory = ball*1/5;
        double finalPrice = taxYear + sneakers + outfit + ball + accessory;

        System.out.println(finalPrice);

    }
}
