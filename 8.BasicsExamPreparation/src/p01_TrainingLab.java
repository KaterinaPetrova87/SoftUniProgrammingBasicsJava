import java.util.Scanner;

public class p01_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double desks = (height * 100 - 100) / 70;
        double rows = width * 100 / 120;

        System.out.println((int) desks * (int) rows - 3);
    }
}
