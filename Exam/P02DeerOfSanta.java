package Exam;

import java.util.Scanner;

public class P02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysMissing=Integer.parseInt(scanner.nextLine());
        int leftFoodKG=Integer.parseInt(scanner.nextLine());
        double foodPerDayFirst=Double.parseDouble(scanner.nextLine());
        double foodPerDaySecond=Double.parseDouble(scanner.nextLine());
        double foodPerDayThird=Double.parseDouble(scanner.nextLine());

        double needFoodFirst=foodPerDayFirst*daysMissing;
        double needFoodSecond=foodPerDaySecond*daysMissing;
        double needFoodThird=foodPerDayThird*daysMissing;
        double totalFood=needFoodFirst+needFoodSecond+needFoodThird;

        if (leftFoodKG>=totalFood){
            System.out.printf("%.0f kilos of food left.",Math.floor(leftFoodKG-totalFood));
        }else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(totalFood-leftFoodKG));
        }
    }
}
