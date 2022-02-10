package MainCourse.NestedLoopsExercise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=Integer.parseInt(scanner.nextLine());
        int n2=Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <=n2; i++) {
            int currentNum=i;
            int evenSun=0;
            int oddSun=0;
            for (int j = 6; j >= 1; j--) {
                int digit=currentNum%10;
                if (j%2==0){
                    evenSun=evenSun+digit;
                }else {
                    oddSun=oddSun+digit;
                }
                currentNum=currentNum/10;
            }
            if (evenSun==oddSun){
                System.out.print(i +" ");
            }
        }
    }
}
