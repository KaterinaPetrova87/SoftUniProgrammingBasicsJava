import java.util.Scanner;

public class p02_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int numOfPuzzles = Integer.parseInt(scanner.nextLine());
        int numOfDolls = Integer.parseInt(scanner.nextLine());
        int numOfTeddyBears = Integer.parseInt(scanner.nextLine());
        int numOfMinions = Integer.parseInt(scanner.nextLine());
        int numOfTrucks = Integer.parseInt(scanner.nextLine());

        double puzzle = 2.60;
        double doll = 3.00;
        double teddyBear = 4.10;
        double minion = 8.20;
        double truck = 2.00;

        int numOfAllToys = numOfPuzzles + numOfDolls + numOfTeddyBears + numOfMinions + numOfTrucks;

        double puzzlesPrice = numOfPuzzles * puzzle;
        double dollsPrice = numOfDolls * doll;
        double teddyBearsPrice = numOfTeddyBears * teddyBear;
        double minionsPrice = numOfMinions * minion;
        double trucksPrice = numOfTrucks * truck;

        double priceAllToys = puzzlesPrice + dollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;
        double income = priceAllToys - priceAllToys * 0.10;

        if (numOfAllToys >= 50) {
            priceAllToys = priceAllToys - priceAllToys * 0.25;
            income = priceAllToys - priceAllToys * 0.10;
        }
        if (income >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", income - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - income);
        }
    }
}
