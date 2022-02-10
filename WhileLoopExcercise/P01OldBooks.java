package MainCourse.WhileLoopExcercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();
        String input = scanner.nextLine();
        int countInput = 0;
        while (!wantedBook.equals(input) && !input.equals("No More Books")) {
            input = scanner.nextLine();
            countInput++;
        }
        if (input.equals("No More Books")) {
            System.out.printf("The book you search is not here!%nYou checked %d books.", countInput);
        } else {
            System.out.printf("You checked %d books and found it.", countInput);
        }
    }
}
