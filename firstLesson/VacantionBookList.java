import java.util.Scanner;

public class VacantionBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int allHours = pages / pagesPerHours;
        int hoursPerDay = allHours / days;

        System.out.println(hoursPerDay);
    }
}
