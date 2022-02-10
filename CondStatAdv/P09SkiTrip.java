package MainCourse.CondStatAdv;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String rate = scanner.nextLine();

        double price = 0;
        int nights = days - 1;

        switch (type) {
            case "room for one person":
                price = nights * 18;
                break;
            case "apartment":
                price = nights * 25;
                if (days<10) {
                    price=price-price*0.3;
                } else if (days <= 15) {
                    price=price-price*0.35;
                }else {
                    price=price-price*0.5;
                }
                break;
            case "president apartment":
                price = nights * 35;
                if (days<10) {
                    price=price-price*0.1;
                } else if (days <= 15) {
                    price=price-price*0.15;
                }else {
                    price=price-price*0.2;
                }
                break;
        }
        if (rate.equals("positive")){
            price=price+price*0.25;
        }else if (rate.equals("negative")){
            price=price-price*0.1;
        }
        System.out.printf("%.2f",price);

    }
}
