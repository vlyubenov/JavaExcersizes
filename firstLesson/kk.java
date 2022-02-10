import java.util.Scanner;
public class kk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Колко пилешки менюта желаете: ");
        int menuChicken = Integer.parseInt(scan.nextLine());
        System.out.print("Колко менюта с риба желаете: ");
        int menuFish = Integer.parseInt(scan.nextLine());
        System.out.print("Колко вегетариански менюта желаете: ");
        int menuVeg = Integer.parseInt(scan.nextLine());
        double costChicken = menuChicken * 10.35;
        double costFish = menuFish * 12.40;
        double costVeg = menuVeg * 8.15;
        double costDesert = (costChicken+costFish+costVeg)*0.2;
        double cost = costChicken+costFish+costVeg+costDesert+2.5;
        System.out.printf("Вашата поръчка е: %.2f лв.",cost);
        System.out.println();
    }
}
