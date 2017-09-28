import java.util.Scanner;

public class p09_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startAsteriskCount = 0;
        int dishesCount = 0;

        if (n % 2 == 0) {
            startAsteriskCount = 2;
            dishesCount = (n - 2) / 2;
            System.out.println(repeatString("-", dishesCount)
                    + repeatString("*", startAsteriskCount) + repeatString("-", dishesCount));

            for (int i = 1; i < (n + 1) / 2; i++) {
                startAsteriskCount += 2;
                dishesCount -= 1;
                System.out.println(repeatString("-", dishesCount) + repeatString("*", startAsteriskCount)
                        + repeatString("-", dishesCount));
            }
            for (int i = 1; i <= n / 2; i++) {
                System.out.println("|" + repeatString("*", n - 2) + "|");
            }

        } else {
            startAsteriskCount = 1;
            dishesCount = (n - 1) / 2;

            System.out.println(repeatString("-", dishesCount) + repeatString("*", startAsteriskCount)
                    + repeatString("-", dishesCount));

            for (int i = 1; i < (n + 1) / 2; i++) {
                startAsteriskCount += 2;
                dishesCount -= 1;
                System.out.println(repeatString("-", dishesCount) + repeatString("*", startAsteriskCount)
                        + repeatString("-", dishesCount));
            }
            for (int i = 1; i <= n / 2; i++) {
                System.out.println("|" + repeatString("*", n - 2) + "|");

            }
        }
    }


    public static String repeatString(String text, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += text;
        }
        return result;
    }
}
