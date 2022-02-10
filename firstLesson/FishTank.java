import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length*width*height;
        double volumeL = volume/1000;
        double occSpace= percent/100;
        double neededL= volumeL*(1-occSpace);

        System.out.println(neededL);
    }
}
