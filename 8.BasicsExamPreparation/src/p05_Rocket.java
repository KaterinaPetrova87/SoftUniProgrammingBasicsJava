import java.util.Scanner;

public class p05_Rocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int width = 3 * n;
        int leftRightDotsTopPart = (width - 2) / 2;
        int spacesTopPart = 0;
        int leftRightDotsBottomPart = n / 2;
        int asterisksBottomPart = 2 * n - 2;

        for (int i = 0; i < n; i++) {
            System.out.println(repeatString(".", leftRightDotsTopPart) + "/"
                    + repeatString(" ", spacesTopPart) + "\\" + repeatString(".", leftRightDotsTopPart));
            leftRightDotsTopPart--;
            spacesTopPart += 2;
        }
        System.out.println(repeatString(".", leftRightDotsTopPart + 1) + repeatString("*", 2 * n)
                + repeatString(".", leftRightDotsTopPart + 1));
        for (int i = 0; i < 2 * n; i++) {
            System.out.println(repeatString(".", n / 2) + "|" + repeatString("\\", 2 * n - 2)
                    + "|" + repeatString(".", n / 2));
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.println(repeatString(".", leftRightDotsBottomPart) + "/" + repeatString("*", asterisksBottomPart)
                    + "\\" + repeatString(".", leftRightDotsBottomPart));
            leftRightDotsBottomPart--;
            asterisksBottomPart += 2;
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
