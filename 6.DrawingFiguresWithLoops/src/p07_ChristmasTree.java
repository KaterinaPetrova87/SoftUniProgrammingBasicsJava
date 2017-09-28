import java.util.Scanner;

public class p07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n+1 ; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

        for (int row = 0; row < n ; row++) {
            for (int i = 0; i < n - row - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int i = 0; i <= row; i++) {
                System.out.print("*");
            }
            System.out.println();
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
