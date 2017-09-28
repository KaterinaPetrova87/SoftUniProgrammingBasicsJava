import java.util.Scanner;

public class p02_WorkHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int numOfWorkers = Integer.parseInt(scanner.nextLine());
        int numOfWorkdays = Integer.parseInt(scanner.nextLine());

        int hours = numOfWorkers*numOfWorkdays*8;
        int penalties = (neededHours-hours)*numOfWorkdays;

        if (hours>=neededHours){
            System.out.printf("%d hours left", hours-neededHours);
        } else {
            System.out.printf("%d overtime\n", neededHours-hours);
            System.out.printf("Penalties: %d", penalties);
        }
    }
}
