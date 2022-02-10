package MainCourse.CondStatAdv;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month=scanner.nextLine();
        int nights=Integer.parseInt(scanner.nextLine());

        double priceSt=0;
        double priceAp=0;
        double discount=0;

        switch (month) {
            case "May":
            case "October":
                priceSt = nights * 50;
                priceAp = nights * 65;

                if (nights > 7 && nights <= 14) {
                    discount = 0.05;
                    priceSt = priceSt - (priceSt * discount);
                } else if (nights > 14){
                    discount = 0.3;
                priceSt = priceSt - (priceSt * discount);
                priceAp = priceAp - (priceAp * 0.1);
                }
                break;
            case "June":
            case "September":
                priceSt=nights*75.20;
                priceAp=nights*68.70;
                if (nights>14){
                    discount=0.2;
                    priceSt=priceSt-(priceSt*discount);
                    priceAp = priceAp - (priceAp * 0.1);
                }
                break;
            case "July":
            case "August":
                priceSt=nights*76;
                priceAp=nights*77;
                if (nights>14){
                    priceAp = priceAp - (priceAp * 0.1);
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",priceAp,priceSt);




    }
}
