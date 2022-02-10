package MainCourse.CondStatAdv;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N1=Double.parseDouble(scanner.nextLine());
        double N2=Double.parseDouble(scanner.nextLine());
        String operator=scanner.nextLine();
        double result=0;
        switch (operator) {
            case "+":
                result = N1 + N2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", N1, operator, N2, result);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", N1, operator, N2, result);
                }
                break;
            case "-":
                result = N1 - N2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", N1, operator, N2, result);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", N1, operator, N2, result);
                }
                break;
            case "*":
                result = N1 * N2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", N1, operator, N2, result);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", N1, operator, N2, result);
                }
                break;
            case "/":
                result = N1 / N2;
                if (N2!=0){
                System.out.printf("%.0f %s %.0f = %.2f", N1, operator, N2, result);
        }else {
                System.out.printf("Cannot divide %.0f by zero",N1);
            }
                break;
            case "%":
                result=N1%N2;
                if (N2!=0) {
                    System.out.printf("%.0f %s %.0f = %.0f", N1, operator, N2, result);
                }else {
                    System.out.printf("Cannot divide %.0f by zero",N1);
                }
                break;
        }
    }
}
