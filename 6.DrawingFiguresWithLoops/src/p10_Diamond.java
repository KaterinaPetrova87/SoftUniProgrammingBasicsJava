import java.util.Scanner;

public class p10_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startAsterisksCount = 0;

        if (n % 2 == 0){
            startAsterisksCount = 2;
        } else {
            startAsterisksCount = 1;
        }
        int dashesCount = (n - startAsterisksCount)/2;


        }

    public static String repeatString(String text, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += text;
        }
        return result;
    }
}
