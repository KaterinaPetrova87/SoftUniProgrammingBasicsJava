import java.text.DecimalFormat;
import java.util.Scanner;

public class p02_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#");

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactuses = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double magnoliasPrice = magnolias*3.25;
        double hyacinthPrice = hyacinth*4.00;
        double rosesPrice = roses*3.50;
        double cactusesPrice = cactuses*8.00;

        double price = magnoliasPrice+hyacinthPrice+rosesPrice+cactusesPrice;
        double income = price - price*0.05;

        if (income >= giftPrice){
            System.out.println("She is left with " + (int)Math.floor(income-giftPrice)+ " leva.");
        } else {
            System.out.printf("She will have to borrow " + (int)Math.ceil(giftPrice-income)+" leva.");
        }
    }
}
