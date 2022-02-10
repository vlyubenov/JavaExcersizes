package MainCourse.secondLesson;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your figure name : ");
        String figure = scanner.nextLine();
        double area = 0;


        if (figure.equals("square")) {
            System.out.println("Type side a ");
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;

        } else if (figure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area= a*b;
        }else if(figure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            area= Math.PI*r*r;

        }else if(figure.equals("triangle")){
            double a= Double.parseDouble(scanner.nextLine());
            double h= Double.parseDouble(scanner.nextLine());
            area = (a*h)/2;

        }



        System.out.printf("%.3f", area);
    }
}
