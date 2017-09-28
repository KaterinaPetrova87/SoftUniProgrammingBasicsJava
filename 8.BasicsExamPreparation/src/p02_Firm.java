import java.util.Scanner;

public class p02_Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int numOfOvertimeWorkers = Integer.parseInt(scanner.nextLine());

        double daysForWork = (days - days * 0.10) * 8;
        double overtime = numOfOvertimeWorkers * 2 * days;
        double totalHours = Math.floor(daysForWork + overtime);

        if (totalHours >= neededHours) {
            System.out.printf("Yes!%.0f hours left.", totalHours - neededHours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", neededHours - totalHours);
        }
    }
}
