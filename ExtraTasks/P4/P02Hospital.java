package ExtraTasks.P4;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int untreated = 0;
        int treated = 0;
        int doctor = 7;
        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (patients > doctor && i % 3 != 0) {
                untreated += patients - doctor;
                treated += doctor;
            } else if (patients <= doctor && i % 3 != 0) {
                treated += patients;
            }
            if (untreated > treated && i % 3 == 0) {
                doctor++;
                if (patients > doctor) {
                    untreated += patients - doctor;
                    treated += doctor;
                } else {
                    treated += patients;
                }
            } else if (treated > untreated && i % 3 == 0) {
                if (patients > doctor) {
                    untreated += patients - doctor;
                    treated += doctor;
                } else {
                    treated += patients;
                }
            }
        }
        System.out.printf("Treated patients: %d.%nUntreated patients: %d.", treated, untreated);
    }
}
