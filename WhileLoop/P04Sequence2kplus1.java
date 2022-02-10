package MainCourse.WhileLoop;

import java.util.Scanner;

public class P04Sequence2kplus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int lastNum = 1;

        while (lastNum <= n) {
            System.out.println(lastNum);
            lastNum = lastNum * 2 + 1;
        }
    }
}
