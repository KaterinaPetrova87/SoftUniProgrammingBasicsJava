import java.util.Scanner;

public class p11_USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;

        System.out.printf("BGN = %.2f", bgn);
    }
}
