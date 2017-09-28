import java.util.Scanner;

public class p05_Crown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int width = 2 * n - 1;
        int height = n / 2 + 4;
        int spaces = n - 5;
        int middleDots = 1;
        int asterisks = n / 2 - 2;

        System.out.println("@" + repeatString(" ", n - 2) + "@" + repeatString(" ", n - 2) + "@");
        System.out.println("**" + repeatString(" ", n - 3) + "*" + repeatString(" ", n - 3) + "**");
        for (int i = 1; i <= n / 2 - 2; i++) {
            System.out.println("*" + repeatString(".", i) + "*" + repeatString(" ", spaces) + "*"
                    + repeatString(".", middleDots) + "*" + repeatString(" ", spaces) + "*" + repeatString(".", i) + "*");
            spaces -= 2;
            middleDots += 2;
        }
        System.out.println("*" + repeatString(".", n / 2 - 1) + "*" + repeatString(".", n - 3)
                + "*" + repeatString(".", n / 2 - 1) + "*");
        System.out.println("*" + repeatString(".", n / 2) + repeatString("*", asterisks)
                + "." + repeatString("*", asterisks) + repeatString(".", n / 2) + "*");
        for (int i = 0; i < 2; i++) {
            System.out.println(repeatString("*", width));
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
