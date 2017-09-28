import java.util.Scanner;

public class p05_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        System.out.println("+ " + repeatString("- ", n - 2) + "+");

        for (int i = 0; i < n - 2; i++) {
            System.out.println("| " + repeatString("- ", n - 2) + "|");
        }

        System.out.println("+ " + repeatString("- ", n - 2) + "+");
    }

    public static String repeatString(String text, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += text;
        }
        return result;
    }
}
