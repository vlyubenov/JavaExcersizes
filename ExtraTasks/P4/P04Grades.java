package ExtraTasks.P4;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        double assertionTo3 = 0;
        double assertionTo4 = 0;
        double assertionTo5 = 0;
        double assertionTo6 = 0;

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;

        for (int i = 0; i < students; i++) {
            double assertion = Double.parseDouble(scanner.nextLine());
            if (assertion >= 2.00 && assertion < 3) {
                assertionTo3 += assertion;
                a1++;
            } else if (assertion < 4) {
                assertionTo4 += assertion;
                a2++;
            } else if (assertion <= 4.99) {
                assertionTo5 += assertion;
                a3++;
            } else if (assertion >= 5) {
                assertionTo6 += assertion;
                a4++;
            }
        }

        double totalAssertions = a1 + a2 + a3 + a4;
        double averageAssertion = (assertionTo3 + assertionTo4 + assertionTo5 + assertionTo6) / totalAssertions;

        System.out.printf("Top students: %.2f%%%nBetween 4.00 and 4.99: %.2f%%%nBetween 3.00 and 3.99: %.2f%%" +
                "%nFail: %.2f%%%nAverage: %.2f", a4 / totalAssertions * 100, a3 /
                totalAssertions * 100, a2 / totalAssertions * 100, a1 / totalAssertions * 100, averageAssertion);
    }
}
