import java.util.Scanner;

public class p01_HousePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double smallestRoomArea = Double.parseDouble(scanner.nextLine());
        double kitchenArea = Double.parseDouble(scanner.nextLine());
        double pricePerSquareMeter = Double.parseDouble(scanner.nextLine());

        double secondRoomArea = smallestRoomArea + smallestRoomArea * 0.10;
        double thirdRoomArea = secondRoomArea + secondRoomArea * 0.10;
        double bathroomArea = smallestRoomArea / 2;

        double area = smallestRoomArea + kitchenArea + secondRoomArea + thirdRoomArea + bathroomArea;
        double totalArea = area + area * 0.05;

        double price = totalArea * pricePerSquareMeter;

        System.out.printf("%.2f", price);
    }
}
