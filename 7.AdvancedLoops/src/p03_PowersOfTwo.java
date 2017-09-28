import java.util.Scanner;

public class p03_PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n ; i++) {
            int number =1;

            for (int j = 0; j <i ; j++) {
                number *=2;

            }
            System.out.println(number);
        }
    }
}
