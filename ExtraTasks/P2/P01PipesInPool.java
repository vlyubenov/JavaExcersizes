package ExtraTasks.P2;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double V = Double.parseDouble(scanner.nextLine());
    double P1 = Double.parseDouble(scanner.nextLine());
    double P2 = Double.parseDouble(scanner.nextLine());
    double H = Double.parseDouble(scanner.nextLine());

    double firstTube=P1*H;
    double secondTube=P2*H;
    double totalL=firstTube+secondTube;

    if (totalL<=V) {
        double totalLPercent = (totalL / V)*100;
       // double totalLPercent = totalL / 100;
       double firstTubePercent = (firstTube/totalL)*100;
       double secondTubePercent = (secondTube/totalL)*100;
        System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalLPercent, firstTubePercent, secondTubePercent);
    }else {
        double overflow=totalL-V;
        System.out.printf("For %.2f hours the pool overflows with %.2f liters.",H,overflow);
    }
    }
    }


