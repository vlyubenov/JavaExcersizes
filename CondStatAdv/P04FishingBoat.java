package MainCourse.CondStatAdv;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
        int fishers=Integer.parseInt(scanner.nextLine());

        double priceShip=0;

        switch (season){
            case "Spring":
                priceShip=3000;
                break;
            case "Summer":
            case "Autumn":
                priceShip=4200;
                break;
            case "Winter":
                priceShip=2600;
                break;
        }
        if (fishers<=6){
            priceShip=priceShip-(priceShip*0.10);
        }else if (fishers<=11){
            priceShip=priceShip-(priceShip*0.15);
        }else {
            priceShip=priceShip-(priceShip*0.25);
        }
        switch (season){
            case "Spring":
            case "Summer":
            case "Winter":
                if (fishers%2==0) {
                    priceShip = priceShip - (priceShip * 0.05);
                }
                break;
        }
        if (budget>=priceShip){
            System.out.printf("Yes! You have %.2f leva left.",budget-priceShip);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",priceShip-budget);
        }
    }
}
