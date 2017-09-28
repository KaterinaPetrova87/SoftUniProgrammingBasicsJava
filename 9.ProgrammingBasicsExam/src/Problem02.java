import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double ivanchoTimeInSec = distanceInMeters * timeInSec;
        double resistance = Math.floor(distanceInMeters / 15) * 12.5;
        double totalTimeInSec = ivanchoTimeInSec + resistance;

        if (totalTimeInSec >= recordInSec) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTimeInSec - recordInSec);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeInSec);
        }
    }
}
