package MainCourse.NestedLoopsExercise;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        int sTickets = 0;
        int standTickets = 0;
        int kidTickets = 0;
        int countTicketsMovie = 0;

        while (!movieName.equals("Finish")) {
            int freePlace = Integer.parseInt(scanner.nextLine());
            String typeTicket = scanner.nextLine();
            int currentCounter = 0;

            while (!typeTicket.equals("End")) {
                currentCounter++;
                countTicketsMovie++;
                switch (typeTicket) {
                    case "student":
                        sTickets++;
                        break;
                    case "standard":
                        standTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                if (currentCounter == freePlace) {
                    break;
                }
                typeTicket = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, currentCounter * 1.00 / freePlace * 100);
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n%.2f%% student tickets.%n%.2f%% standard tickets.%n%.2f%% kids tickets."
                , countTicketsMovie, (sTickets * 1.00 / countTicketsMovie) * 100, (standTickets * 1.00 / countTicketsMovie) * 100, (kidTickets * 1.00 / countTicketsMovie) * 100);
    }
}
