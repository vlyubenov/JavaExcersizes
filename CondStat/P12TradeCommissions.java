package MainCourse.CondStat;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city=scanner.nextLine();
        double volumeS=Double.parseDouble(scanner.nextLine());
        double commission=0;
        switch (city){
            case "Sofia":
                if (volumeS>=0&&volumeS<=500){
                    commission=volumeS*0.05;
                    System.out.printf("%.2f",commission);
                }else if (volumeS>500&&volumeS<=1000) {
                    commission = volumeS * 0.07;
                    System.out.printf("%.2f",commission);
                }else if (volumeS>1000&&volumeS<=10000) {
                    commission = volumeS * 0.08;
                    System.out.printf("%.2f",commission);
                }else if (volumeS>10000) {
                    commission = volumeS * 0.12;
                    System.out.printf("%.2f",commission);
                }else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (volumeS>=0&&volumeS<=500){
                    commission=volumeS*0.045;
                    System.out.printf("%.2f",commission);
                }else if (volumeS>500&&volumeS<=1000) {
                    commission = volumeS * 0.075;
                    System.out.printf("%.2f",commission);
                }else if (volumeS>1000&&volumeS<=10000) {
                    commission = volumeS * 0.10;
                    System.out.printf("%.2f",commission);
                }else if (volumeS>10000) {
                    commission = volumeS * 0.13;
                    System.out.printf("%.2f",commission);
                }else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (volumeS>=0&&volumeS<=500){
                    commission=volumeS*0.055;
                    System.out.printf("%.2f",commission);
                }else if (volumeS>500&&volumeS<=1000) {
                    commission = volumeS * 0.08;
                    System.out.printf("%.2f",commission);
                }else if (volumeS>1000&&volumeS<=10000) {
                    commission = volumeS * 0.12;
                    System.out.printf("%.2f",commission);
                }else if (volumeS>10000) {
                    commission = volumeS * 0.145;
                    System.out.printf("%.2f",commission);
                }else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
