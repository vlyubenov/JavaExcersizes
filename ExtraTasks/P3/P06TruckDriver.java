package ExtraTasks.P3;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season=scanner.nextLine();
        double monthKM=Double.parseDouble(scanner.nextLine());

        double priceKM=0;
        double salary=0;

        switch (season){
            case "Spring":
            case "Autumn":
                if (monthKM<=5000){
                    priceKM=0.75;
                }else if (5000<monthKM&&monthKM<=10000){
                    priceKM=0.95;
                }else if (monthKM<=20000){
                    priceKM=1.45;
                }
                break;
            case "Summer":
                if (monthKM<=5000){
                    priceKM=0.90;
                }else if (5000<monthKM&&monthKM<=10000){
                    priceKM=1.10;
                }else if (monthKM<=20000){
                    priceKM=1.45;
                }
                break;
            case "Winter":
                if (monthKM<=5000){
                    priceKM=1.05;
                }else if (5000<monthKM&&monthKM<=10000){
                    priceKM=1.25;
                }else if (monthKM<=20000){
                    priceKM=1.45;
                }
                break;
        }
        salary=4*(priceKM*monthKM);
        salary=salary-(salary*0.10);
        System.out.printf("%.2f",salary);
    }
}
