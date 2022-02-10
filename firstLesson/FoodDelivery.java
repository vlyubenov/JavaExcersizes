import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veg = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double vegPrice = veg * 8.15;
        double sumPrice = chickenPrice + fishPrice + vegPrice;
        double desertPrice = sumPrice * 20/100;
        double finalPrice = sumPrice + desertPrice + 2.50;

        System.out.println(finalPrice);
    }
}
