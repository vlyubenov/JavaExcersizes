package MainCourse.secondTasks;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int pcsGPU = Integer.parseInt(scanner.nextLine());
        int pcsCPU = Integer.parseInt(scanner.nextLine());
        int pcsRAM = Integer.parseInt(scanner.nextLine());
        double discount = 0;
        double totalPrice = pcsGPU * 250 + pcsCPU * (0.35*(pcsGPU* 250)) + pcsRAM * (0.10*(pcsGPU* 250));
        if (pcsGPU > pcsCPU) {
            discount = 0.15 * totalPrice;
            totalPrice=totalPrice-discount;
        }
        if (totalPrice<=budget){
            System.out.printf("You have %.2f leva left!",budget-totalPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",totalPrice-budget);
        }
    }
}
