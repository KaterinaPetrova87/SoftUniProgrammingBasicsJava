import java.util.Scanner;

public class p05_Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int height = 4 * n + 4;
        int width = 3 * n + 1;
        int rightDotsTopPart = 2 * n;
        int middleDotsBottomPart = 2 * n;

        System.out.println("+" + repeatString("~", n - 2) + "+" + repeatString(".", 2 * n + 1));
        for (int i = 0; i < 2 * n + 1; i++) {
            System.out.println("|" + repeatString(".", i) + "\\" + repeatString("~", n - 2)
                    + "\\" + repeatString(".", rightDotsTopPart));
            rightDotsTopPart--;
        }
        for (int i = 0; i < 2 * n + 1; i++) {
            System.out.println(repeatString(".", i) + "\\" + repeatString(".", middleDotsBottomPart)
                    + "|" + repeatString("~", n - 2) + "|");
            middleDotsBottomPart--;
        }
        System.out.println(repeatString(".", 2 * n + 1) + "+" + repeatString("~", n - 2) + "+");

    }

    public static String repeatString(String text, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += text;
        }
        return result;
    }
}
