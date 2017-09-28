import java.util.Scanner;

public class p05_ChristmasHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int width = 4 * n + 1;
        int height = 2 * n + 5;
        int leftRightDots = 2 * n - 2;

        System.out.println(repeatString(".", 2 * n - 1) + "/|\\" + repeatString(".", 2 * n - 1));
        System.out.println(repeatString(".", 2 * n - 1) + "\\|/" + repeatString(".", 2 * n - 1));
        System.out.println(repeatString(".", 2 * n - 1) + "***" + repeatString(".", 2 * n - 1));
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.println(repeatString(".", leftRightDots) + "*" + repeatString("-", i) + "*"
                    + repeatString("-", i) + "*" + repeatString(".", leftRightDots));
            leftRightDots--;
        }
        System.out.println(repeatString("*", width));
        for (int i = 1; i <= width; i++) {
            if (i % 2 == 0) {
                System.out.print(".");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.println(repeatString("*", width));
    }

    public static String repeatString(String text, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += text;
        }
        return result;
    }
}
