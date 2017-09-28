import java.util.Scanner;

public class p06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int spacesCount = 0;
        int asterisks = 0;

        for (int row = 0; row < n; row++) {
            //print spaces

            for (int i = 0; i < n - row - 1; i++) {
                System.out.print(" ");
            }
            //print asterisks
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n - 1; row > 0; row--) {
            for (int i = row; i < n; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
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
