package MainCourse.secondTasks;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double clothPrize= Double.parseDouble(scanner.nextLine());

        clothPrize= extras* clothPrize;
        double decor= (budget * 0.10);

        if (extras>150){
            clothPrize=clothPrize-(clothPrize*0.10);
        }if (decor+clothPrize>budget){
            System.out.printf("Not enough money!%n Wingard needs %.2f leva more.", (decor+clothPrize)-budget);
        }else {
            System.out.printf("Action!%n Wingard starts filming with %.2f leva left.",budget-(decor+clothPrize));
        }
    }
}
