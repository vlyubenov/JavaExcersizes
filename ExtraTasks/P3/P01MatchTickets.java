package ExtraTasks.P3;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());

        double priceTicket = 0;
        double ticketsCash = 0;

        switch (category) {
            case "VIP":
                priceTicket = 499.99 * group;
                break;
            case "Normal":
                priceTicket = 249.99 * group;
                break;
        }

        if (1 <= group && group <= 4) {
            ticketsCash = budget - (budget * 0.75);
        } else if (5 <= group && group <= 9) {
            ticketsCash = budget - (budget * 0.60);
        } else if (10 <= group && group <= 24) {
            ticketsCash = budget - (budget * 0.50);
        } else if (25 <= group && group <= 49) {
            ticketsCash = budget - (budget * 0.40);
        } else if (50 <= group) {
            ticketsCash = budget - (budget * 0.25);
        }

        if (ticketsCash >= priceTicket) {
            System.out.printf("Yes! You have %.2f leva left.", ticketsCash - priceTicket);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", priceTicket - ticketsCash);
        }
    }
}
