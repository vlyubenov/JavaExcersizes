package ExtraTasks.P5;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cleaningGel = Integer.parseInt(scanner.nextLine());
        int cleaningGelML = cleaningGel * 750;
        int countCharging = 0;
        int plates = 0;
        int pot = 0;
        while (cleaningGelML >= 0) {
            String dishes = scanner.nextLine();
            countCharging++;
            if (dishes.equals("End")) {
                break;
            }
            if (countCharging % 3 == 0) {
                pot += Integer.parseInt(dishes);
                cleaningGelML -= Integer.parseInt(dishes) * 15;
            } else {
                plates += Integer.parseInt(dishes);
                cleaningGelML -= Integer.parseInt(dishes) * 5;
            }
        }
        if (cleaningGelML >= 0) {
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.", plates, pot, cleaningGelML);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(cleaningGelML));
        }
    }
}
