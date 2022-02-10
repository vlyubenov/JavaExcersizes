package ExtraTasks.P1;

import java.util.Scanner;

public class P10WeatherForecastPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees=Double.parseDouble(scanner.nextLine());

        if (degrees<=35.00&&degrees>=26.00){
            System.out.println("Hot");
        }else if (degrees<=25.99&&degrees>=20.1){
            System.out.println("Warm");
        }else if (degrees<=20.09&&degrees>=15.00){
            System.out.println("Mild");
        }else if (degrees<=14.99&&degrees>=12.00){
            System.out.println("Cool");
        }else if (degrees<=11.99&&degrees>=5.00){
            System.out.println("Cold");
        }else {
            System.out.println("unknown");
        }
    }
}
