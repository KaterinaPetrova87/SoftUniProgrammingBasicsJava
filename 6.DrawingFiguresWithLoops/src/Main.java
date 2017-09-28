import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int asterisks = 0;
        int dishes = 0;
        int middle = n - 4;

        if (n == 1) {
            System.out.println("*");
        }
        if (n % 2 == 0) {
            asterisks = 2;
            dishes = (n - 2) / 2;
            for (int i = 0; i < n / 2; i++) {
                System.out.println(repeatString("-", dishes) + "*"
                        + repeatString("-", 2 * i) + "*" + repeatString("-", dishes));
                dishes--;
            }
            dishes = 1;
            for (int i = 0; i < n / 2 - 1; i++) {
                System.out.println(repeatString("-", dishes) + "*"
                        + repeatString("-", middle) + "*" + repeatString("-", dishes));
                middle -= 2;
                dishes++;
            }
        } else if (n%2 == 1 && n !=1) {
            asterisks = 1;
            dishes = (n - 1) / 2;
            System.out.println(repeatString("-", (n - 1) / 2) + "*" + repeatString("-", (n - 1) / 2));
            for (int i = 0; i < n / 2; i++) {
                System.out.println(repeatString("-", dishes - 1) + "*" + repeatString("-", 2 * i + 1) + "*" + repeatString("-", dishes - 1));
                dishes--;
            }
            for (int i = 0; i < (n / 2) - 1; i++) {
                System.out.println(repeatString("-", i + 1) + "*"
                        + repeatString("-", middle) + "*" + repeatString("-", i + 1));
                middle -= 2;
                dishes++;
            }
            System.out.println(repeatString("-", (n - 1) / 2) + "*" + repeatString("-", (n - 1) / 2));
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
