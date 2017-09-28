import java.util.Scanner;

public class p04_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double water = 20;
        double internet = 15;
        double other = 0;
        double waterPrice = water * months;
        double internetPrice = internet * months;
        double average = 0;
        double electricityPrice = 0;

        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            electricityPrice += electricity;
            other += (electricity + water + internet) + ((electricity + water + internet) * 0.20);
        }
        average = (electricityPrice + waterPrice + internetPrice + other) / months;

        System.out.printf("Electricity: %.2f lv\n", electricityPrice);
        System.out.printf("Water: %.2f lv\n", waterPrice);
        System.out.printf("Internet: %.2f lv\n", internetPrice);
        System.out.printf("Other: %.2f lv\n", other);
        System.out.printf("Average: %.2f lv", average);
    }
}
