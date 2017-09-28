import java.util.Scanner;

public class p03_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numOfPeopleInGroup = Integer.parseInt(scanner.nextLine());

        double transportCosts = 0;
        double neededMoney = 0;

        if (category.equals("VIP")) {
            if (numOfPeopleInGroup >= 1 && numOfPeopleInGroup <= 4) {
                transportCosts = budget * 0.75;
            } else if (numOfPeopleInGroup >= 5 && numOfPeopleInGroup <= 9) {
                transportCosts = budget * 0.60;
            } else if (numOfPeopleInGroup >= 10 && numOfPeopleInGroup <= 24) {
                transportCosts = budget * 0.50;
            } else if (numOfPeopleInGroup >= 25 && numOfPeopleInGroup <= 49) {
                transportCosts = budget * 0.40;
            } else if (numOfPeopleInGroup >= 50) {
                transportCosts = budget * 0.25;
            }
            neededMoney = transportCosts + 499.99 * numOfPeopleInGroup;
        } else if (category.equals("Normal")) {
            if (numOfPeopleInGroup >= 1 && numOfPeopleInGroup <= 4) {
                transportCosts = budget * 0.75;
            } else if (numOfPeopleInGroup >= 5 && numOfPeopleInGroup <= 9) {
                transportCosts = budget * 0.60;
            } else if (numOfPeopleInGroup >= 10 && numOfPeopleInGroup <= 24) {
                transportCosts = budget * 0.50;
            } else if (numOfPeopleInGroup >= 25 && numOfPeopleInGroup <= 49) {
                transportCosts = budget * 0.40;
            } else if (numOfPeopleInGroup >= 50) {
                transportCosts = budget * 0.25;
            }
            neededMoney = transportCosts + 249.99 * numOfPeopleInGroup;
        }
        if (budget >= neededMoney) {
            System.out.printf("Yes! You have %.2f leva left.", budget - neededMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney - budget);
        }
    }
}
