import java.util.Scanner;

public class p02_ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double floorWidth = Double.parseDouble(scanner.nextLine());
        double floorLength = Double.parseDouble(scanner.nextLine());
        double triangleBase = Double.parseDouble(scanner.nextLine());
        double triangleHeight = Double.parseDouble(scanner.nextLine());
        double tilePrice = Double.parseDouble(scanner.nextLine());
        double moneyForWorkman = Double.parseDouble(scanner.nextLine());

        double floorArea = floorWidth * floorLength;
        double tileArea = triangleBase * triangleHeight/2;
        double neededTiles = Math.ceil(floorArea / tileArea) + 5;
        double totalPrice = neededTiles * tilePrice + moneyForWorkman;

        if (money >= totalPrice) {
            System.out.printf("%.2f lv left.", money - totalPrice);
        } else {
            System.out.printf("You'll need %.2f lv more.", totalPrice - money);
        }
    }
}
