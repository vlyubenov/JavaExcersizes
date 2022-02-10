package ExtraTasks.P6;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        String bad = scanner.nextLine();
        char fLetter = start.charAt(0);
        char sLetter = end.charAt(0);
        char tLetter = bad.charAt(0);
        int count = 0;
        for (int i = fLetter; i <= sLetter; i++) {
            for (int j = fLetter; j <= sLetter; j++) {
                for (int k = fLetter; k <= sLetter; k++) {
                    char a1 = ((char) i);
                    char a2 = ((char) j);
                    char a3 = ((char) k);
                    if (a1 != tLetter && a2 != tLetter && a3 != tLetter) {
                        count++;
                        System.out.printf("%s%s%s ", a1, a2, a3);
                    }
                }
            }
        }
        System.out.printf("%d%n",count);
    }
}
