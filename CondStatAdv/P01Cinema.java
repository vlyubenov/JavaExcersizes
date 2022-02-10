package MainCourse.CondStatAdv;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type=scanner.nextLine();
        int rows=Integer.parseInt(scanner.nextLine());
        int cols=Integer.parseInt(scanner.nextLine());

        double places=rows*cols;
        double price=0;
        switch (type){
            case "Premiere":
                price=places*12.00;
                break;
            case "Normal":
                price=places*7.5;
                break;
            case "Discount":
                price=places*5.00;
                break;
        }
        System.out.printf("%.2f leva",price);
    }
}
