import java.util.Scanner;

public class p04_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLoads = Integer.parseInt(scanner.nextLine());
        double allLoadsTons = 0;
        double tonsWithMicrobus = 0;
        double tonsWithTruck = 0;
        double tonsWithTrain = 0;
        double averagePrice = 0;

        for (int i = 0; i < numOfLoads; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            allLoadsTons += tons;
            if (tons <= 3) {
                tonsWithMicrobus += tons;
            } else if (tons > 3 && tons <= 11) {
                tonsWithTruck += tons;
            } else {
                tonsWithTrain += tons;
            }
        }
        averagePrice = (tonsWithMicrobus * 200 + tonsWithTruck * 175 + tonsWithTrain * 120) / allLoadsTons;
        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", tonsWithMicrobus / allLoadsTons * 100);
        System.out.printf("%.2f%%%n", tonsWithTruck / allLoadsTons * 100);
        System.out.printf("%.2f%%", tonsWithTrain / allLoadsTons * 100);
    }
}
