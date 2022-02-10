package MainCourse.CondStatAdv;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget= Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();

        double holiday=0;
        String location="";
        String accommodation="";

        switch (season){
            case "summer":
                if (budget<=100){
                    holiday=budget-(budget*0.30);
                    location="Somewhere in Bulgaria";
                    accommodation="Camp";
                }else if (budget<=1000){
                    holiday=budget-(budget*0.40);
                    location="Somewhere in Balkans";
                    accommodation="Camp";
                }else {
                    holiday=budget-(budget*0.90);
                    location="Somewhere in Europe";
                    accommodation="Hotel";
                }
                break;
            case "winter":
                accommodation="Hotel";
                if (budget<=100){
                    holiday=budget-(budget*0.70);
                    location="Somewhere in Bulgaria";
                }else if (budget<=1000){
                    holiday=budget-(budget*0.80);
                    location="Somewhere in Balkans";
                }else {
                    holiday=budget-(budget*0.90);
                    location="Somewhere in Europe";
                }
                break;
        }
        System.out.printf("%s%n%s - %.2f",location,accommodation,budget-holiday);

    }
}
