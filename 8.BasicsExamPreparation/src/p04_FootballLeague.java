import java.util.Scanner;

public class p04_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacityOfStadium = Double.parseDouble(scanner.nextLine());
        double numOfAllFans = Double.parseDouble(scanner.nextLine());

        double fansA = 0;
        double fansB = 0;
        double fansV = 0;
        double fansG = 0;

        for (int i = 1; i <= numOfAllFans; i++) {
            String sector = scanner.nextLine();

            if (sector.equals("A")) {
                fansA++;
            } else if (sector.equals("B")) {
                fansB++;
            } else if (sector.equals("V")) {
                fansV++;
            } else if (sector.equals("G")) {
                fansG++;
            }
        }
        System.out.printf("%.2f%%\n", fansA / numOfAllFans * 100);
        System.out.printf("%.2f%%\n", fansB / numOfAllFans * 100);
        System.out.printf("%.2f%%\n", fansV / numOfAllFans * 100);
        System.out.printf("%.2f%%\n", fansG / numOfAllFans * 100);
        System.out.printf("%.2f%%", numOfAllFans / capacityOfStadium * 100);
    }
}
