package ExtraTasks.P1;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double backSide= x*x;
        double frontSide= backSide - 1.2*2;
        double sideSides= x*y+x*y-(1.5*1.5+1.5*1.5);
        double greenPaint= (backSide+frontSide+sideSides)/3.4;

        double ceil= 2*(x*y)+2*(x*h/2);
        double redPaint= ceil/4.3;
        System.out.printf("%.2f%n%.2f",greenPaint,redPaint);
    }
}
