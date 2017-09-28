import java.util.Scanner;

public class p06_ControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int controlNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int moves = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                sum += i * 2 + j * 3;
                moves++;
                if (sum >= controlNum) {
                    System.out.println(moves + " moves");
                    System.out.println("Score: " + sum + " >= " + controlNum);
                    return;
                }
            }
        }
        System.out.println(moves + " moves");
    }
}
