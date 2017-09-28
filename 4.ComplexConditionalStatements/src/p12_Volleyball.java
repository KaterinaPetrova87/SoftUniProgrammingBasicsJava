import java.util.Scanner;

public class p12_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsInHometown = Integer.parseInt(scanner.nextLine());
        double weekendsInSofia = 48 - weekendsInHometown;
        double gamesInWeekends = weekendsInSofia * 3.0 / 4;
        double gamesInHometown = weekendsInHometown;
        double gamesInHoliday = holidays * 2.0 / 3;
        double allGames = gamesInHoliday + gamesInHometown + gamesInWeekends;

        if (year.equals("leap")){
            allGames = allGames + allGames * 0.15;
        }
        System.out.println((int)allGames);
    }
}
