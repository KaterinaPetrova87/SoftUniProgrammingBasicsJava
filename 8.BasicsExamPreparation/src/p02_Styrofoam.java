import java.util.Scanner;

public class p02_Styrofoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double houseArea = Double.parseDouble(scanner.nextLine());
        double windows = Double.parseDouble(scanner.nextLine());
        double styrofoamPerPackage = Double.parseDouble(scanner.nextLine());
        double priceStyrofoamPerPackage = Double.parseDouble(scanner.nextLine());

        double totalHouseArea = (houseArea - windows * 2.4) + (houseArea - windows * 2.4) * 0.10;
        double neededPackages = Math.ceil(totalHouseArea / styrofoamPerPackage);
        double totalPrice = neededPackages * priceStyrofoamPerPackage;

        if (budget >= totalPrice) {
            System.out.printf("Spent: %.2f\n", totalPrice);
            System.out.printf("Left: %.2f\n", budget - totalPrice);
        } else {
            System.out.printf("Need more: %.2f", totalPrice - budget);
        }

    }
}
