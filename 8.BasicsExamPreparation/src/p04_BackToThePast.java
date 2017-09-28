import java.util.Scanner;

public class p04_BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        int ivanchoYears = 17;
        double costs = 0;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                costs = 12000;
                money = money - costs;
            } else {
                ivanchoYears += 2;
                costs = 12000 + 50 * ivanchoYears;
                money = money - costs;
            }
        }
        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
