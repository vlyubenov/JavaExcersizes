package MainCourse.CondStat;

import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age=Double.parseDouble(scanner.nextLine());
        String sex= scanner.nextLine();

        if (sex.equals("f")){
            if (age<16){
                System.out.println("Miss");
            }else if (age>=16){
                System.out.println("Ms.");
            }
        }else if (sex.equals("m")){
            if (age<16){
                System.out.println("Master");
            }else if (age>=16){
                System.out.println("Mr.");
            }
        }
    }
}
