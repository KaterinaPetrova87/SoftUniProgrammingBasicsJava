import java.util.Scanner;

public class p05_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int width = 5 * n;
        int height = 3 * n + 2;
        int leftRightDotsUpperPart = n - 1;
        int middleDotsUpperPart = 3 * n;
        int middleDotsBottomPart = width - 4;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(repeatString(".", n) + repeatString("*", 3 * n) + repeatString(".", n));
            } else {
                System.out.println(repeatString(".", leftRightDotsUpperPart) + "*" + repeatString(".", middleDotsUpperPart) + "*"
                        + repeatString(".", leftRightDotsUpperPart));
                leftRightDotsUpperPart--;
                middleDotsUpperPart += 2;
            }
        }
        System.out.println(repeatString("*", width));
        for (int i = 1; i <= 2 * n; i++) {
            System.out.println(repeatString(".", i) + "*" + repeatString(".", middleDotsBottomPart) + "*"
                    + repeatString(".", i));
            middleDotsBottomPart -= 2;
        }
        System.out.println(repeatString(".", 2 * n + 1) + repeatString("*", n - 2)
                + repeatString(".", 2 * n + 1));
    }

    public static String repeatString(String text, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += text;
        }
        return result;
    }
}
