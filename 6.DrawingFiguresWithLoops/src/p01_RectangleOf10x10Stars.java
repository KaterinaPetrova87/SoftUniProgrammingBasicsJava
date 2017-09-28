import java.util.Scanner;

public class p01_RectangleOf10x10Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10  ; j++) {
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
