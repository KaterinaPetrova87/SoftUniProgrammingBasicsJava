import java.util.Scanner;

public class p03_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfJuniors = Integer.parseInt(scanner.nextLine());
        int numOfSeniors = Integer.parseInt(scanner.nextLine());
        String typeOfRoad = scanner.nextLine();
        int allBakers = numOfJuniors + numOfSeniors;

        double juniorsFee = 0;
        double seniorsFee = 0;
        double income = 0;

        if (typeOfRoad.equals("trail")) {
            juniorsFee = numOfJuniors * 5.50;
            seniorsFee = numOfSeniors * 7.00;
        } else if (typeOfRoad.equals("cross-country")) {
            juniorsFee = numOfJuniors * 8.00;
            seniorsFee = numOfSeniors * 9.50;
            if (allBakers >= 50) {
                juniorsFee = (numOfJuniors * 8.00) - (numOfJuniors * 8.00) * 0.25;
                seniorsFee = (numOfSeniors * 9.50) - (numOfSeniors * 9.50) * 0.25;
            }
        } else if (typeOfRoad.equals("downhill")) {
            juniorsFee = numOfJuniors * 12.25;
            seniorsFee = numOfSeniors * 13.75;
        } else if (typeOfRoad.equals("road")) {
            juniorsFee = numOfJuniors * 20.00;
            seniorsFee = numOfSeniors * 21.50;
        }
        income = (juniorsFee + seniorsFee) - (juniorsFee + seniorsFee) * 0.05;
        System.out.printf("%.2f", income);
    }
}
