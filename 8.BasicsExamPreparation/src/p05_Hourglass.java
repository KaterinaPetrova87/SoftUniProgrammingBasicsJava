import java.util.Scanner;

public class p05_Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int height = 2 * n + 1;
        int width = 2 * n + 1;
        int leftRightDotsTopPart = 2;
        int sign = 2 * n - 5;

        System.out.println(repeatString("*", width));
        System.out.println(".*" + repeatString(" ", width - 4) + "*.");
        for (int i = 0; i < n - 2; i++) {
            System.out.println(repeatString(".", leftRightDotsTopPart) + "*" + repeatString("@", sign)
                    + "*" + repeatString(".", leftRightDotsTopPart));
            leftRightDotsTopPart++;
            sign -= 2;
        }
        System.out.println(repeatString(".", n) + "*" + repeatString(".", n));
        for (int i = 0; i < n - 2; i++) {
            System.out.println(repeatString(".", leftRightDotsTopPart - 1) + "*"
                    + repeatString(" ", i) + "@" + repeatString(" ", i) + "*" + repeatString(".", leftRightDotsTopPart - 1));
            leftRightDotsTopPart--;
        }
        System.out.println(".*" + repeatString("@", width - 4) + "*.");
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
