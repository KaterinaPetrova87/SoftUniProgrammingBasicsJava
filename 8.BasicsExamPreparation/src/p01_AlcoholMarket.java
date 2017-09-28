import java.util.Scanner;

public class p01_AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerQuantity = Double.parseDouble(scanner.nextLine());
        double wineQuantity = Double.parseDouble(scanner.nextLine());
        double rakiaQuantity = Double.parseDouble(scanner.nextLine());
        double whiskeyQuantity = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice / 2;
        double winePrice = (rakiaPrice - rakiaPrice * 0.40);
        double beerPrice = (rakiaPrice - rakiaPrice * 0.80);


        double priceAll = rakiaPrice * rakiaQuantity + winePrice * wineQuantity + beerPrice * beerQuantity + whiskeyPrice * whiskeyQuantity;

        System.out.printf("%.2f", priceAll);
    }
}

