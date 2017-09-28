import java.util.Scanner;

public class HowToBreakNestedLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean forceBreak = true;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    forceBreak = true;
                    break;
                }
            }

            if (forceBreak) {
                break;
            }
        }
    }
}
