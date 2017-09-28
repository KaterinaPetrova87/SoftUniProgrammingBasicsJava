import java.util.Scanner;

public class p02_Cups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int workdays = Integer.parseInt(scanner.nextLine());

        int workHours = workers * workdays * 8;
        int madeCups = workHours / 5;

        if (madeCups >= cups) {
            System.out.printf("%.2f extra money", (madeCups - cups) * 4.2);
        } else {
            System.out.printf("Losses: %.2f", (cups - madeCups) * 4.2);
        }
    }
}
