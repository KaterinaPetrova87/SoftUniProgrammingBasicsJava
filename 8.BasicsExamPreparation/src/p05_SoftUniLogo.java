import java.util.Scanner;

public class p05_SoftUniLogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int height = 4 * n - 2;
        int width = 12 * n - 5;
        int leftRightDotsTopPart = (width - 7) / 2;
        int hashtagTopPart = 7;
        int leftRightDotsBottomPart = 2;

        System.out.println(repeatString(".", (width - 1) / 2) + "#" + repeatString(".", (width - 1) / 2));
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.println(repeatString(".", leftRightDotsTopPart) + repeatString("#", hashtagTopPart)
                    + repeatString(".", leftRightDotsTopPart));
            leftRightDotsTopPart -= 3;
            hashtagTopPart += 6;
        }
        for (int i = 0; i < n - 2; i++) {
            System.out.println("|" + repeatString(".", leftRightDotsBottomPart) + repeatString("#", hashtagTopPart - 12)
                    + repeatString(".", leftRightDotsBottomPart + 1));
            leftRightDotsBottomPart += 3;
            hashtagTopPart -= 6;
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println("|" + repeatString(".", leftRightDotsBottomPart) + repeatString("#", hashtagTopPart - 12)
                    + repeatString(".", leftRightDotsBottomPart + 1));
        }
        System.out.println("@" + repeatString(".", leftRightDotsBottomPart) + repeatString("#", hashtagTopPart - 12)
                + repeatString(".", leftRightDotsBottomPart + 1));

    }

    public static String repeatString(String text, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += text;
        }
        return result;
    }
}
