import java.util.Scanner;

public class p04_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int treated = 0;
        int untreated = 0;
        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && untreated > treated) {
                doctors++;
            }
            if (patients > doctors) {
                untreated += patients - doctors;
                treated += doctors;
            } else {
                treated += patients;
            }


        }
        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.", untreated);
    }
}
