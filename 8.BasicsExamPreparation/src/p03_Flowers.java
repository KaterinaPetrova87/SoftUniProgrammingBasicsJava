import java.util.Scanner;

public class p03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfChrysanthemums = Integer.parseInt(scanner.nextLine());
        int numOfRoses = Integer.parseInt(scanner.nextLine());
        int numOfTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String day = scanner.nextLine();

        int numOfFlowers = numOfChrysanthemums + numOfRoses + numOfTulips;

        double priceChrysanthemums = 0;
        double priceRoses = 0;
        double priceTulips = 0;
        double priceFlowers = 0;

        if (season.equals("Spring")) {
            priceChrysanthemums = numOfChrysanthemums * 2.00;
            priceRoses = numOfRoses * 4.10;
            priceTulips = numOfTulips * 2.50;
            priceFlowers = priceChrysanthemums + priceRoses + priceTulips;
            if (day.equals("Y")) {
                priceFlowers = priceFlowers + priceFlowers * 0.15;
            }
            if (numOfTulips > 7) {
                priceFlowers = priceFlowers - priceFlowers * 0.05;
            }
            if (numOfFlowers > 20) {
                priceFlowers = priceFlowers - priceFlowers * 0.20;
            }
        } else if (season.equals("Summer")) {
            priceChrysanthemums = numOfChrysanthemums * 2.00;
            priceRoses = numOfRoses * 4.10;
            priceTulips = numOfTulips * 2.50;
            priceFlowers = priceChrysanthemums + priceRoses + priceTulips;
            if (day.equals("Y")) {
                priceFlowers = priceFlowers + priceFlowers * 0.15;
            }
            if (numOfFlowers > 20) {
                priceFlowers = priceFlowers - priceFlowers * 0.20;
            }
        } else if (season.equals("Winter")) {
            priceChrysanthemums = numOfChrysanthemums * 3.75;
            priceRoses = numOfRoses * 4.50;
            priceTulips = numOfTulips * 4.15;
            priceFlowers = priceChrysanthemums + priceRoses + priceTulips;
            if (day.equals("Y")) {
                priceFlowers = priceFlowers + priceFlowers * 0.15;
            }
            if (numOfRoses >= 10) {
                priceFlowers = priceFlowers - priceFlowers * 0.10;
            }
            if (numOfFlowers > 20) {
                priceFlowers = priceFlowers - priceFlowers * 0.20;
            }
        } else if (season.equals("Autumn")) {
            priceChrysanthemums = numOfChrysanthemums * 3.75;
            priceRoses = numOfRoses * 4.50;
            priceTulips = numOfTulips * 4.15;
            priceFlowers = priceChrysanthemums + priceRoses + priceTulips;
            if (day.equals("Y")) {
                priceFlowers = priceFlowers + priceFlowers * 0.15;
            }
            if (numOfFlowers > 20) {
                priceFlowers = priceFlowers - priceFlowers * 0.20;
            }
        }
        System.out.printf("%.2f", priceFlowers + 2);
    }
}
