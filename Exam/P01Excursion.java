package Exam;

import java.util.Scanner;

public class P01Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group=Integer.parseInt(scanner.nextLine());
        int nights=Integer.parseInt(scanner.nextLine());
        int travelCards=Integer.parseInt(scanner.nextLine());
        int museumTickets=Integer.parseInt(scanner.nextLine());

        double Sum=(20*nights)+(travelCards*1.60)+(museumTickets*6.00);
        double totalSum=(Sum*group)+(Sum*group*0.25);
        System.out.printf("%.2f",totalSum);
    }
}
