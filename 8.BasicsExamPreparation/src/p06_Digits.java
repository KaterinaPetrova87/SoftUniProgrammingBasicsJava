import java.util.Scanner;

public class p06_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int firstDigit = n / 100;
        int thirdDigit = n % 10;
        int tenDigit = n / 10;
        int secondDigit = tenDigit % 10;

        for (int i = 1; i <= firstDigit+secondDigit; i++) {
            for (int j = 1; j <= firstDigit+thirdDigit; j++) {
                if (n % 5 == 0) {
                    n = n - firstDigit;
                } else if (n % 3 == 0) {
                    n = n - secondDigit;
                } else {
                    n = n + thirdDigit;
                }
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
