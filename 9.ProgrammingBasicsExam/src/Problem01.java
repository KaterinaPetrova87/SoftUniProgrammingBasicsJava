import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int confectioners = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int wafers = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double cakesPrice = cakes * 45;
        double wafersPrice = wafers * 5.80;
        double pancakesPrice = pancakes * 3.20;

        double sumPerDay = (cakesPrice + wafersPrice + pancakesPrice) * confectioners;
        double sumCampaign = sumPerDay * days;
        double totalSum = sumCampaign - (sumCampaign / 8);

        System.out.printf("%.2f", totalSum);


    }
}
