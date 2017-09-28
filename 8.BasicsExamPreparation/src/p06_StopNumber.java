import java.util.Scanner;

public class p06_StopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int stopNum = Integer.parseInt(scanner.nextLine());

        for (int i = m; i >= n; i--) {
            if (i % 2 == 0 && i % 3 == 0){
                if (i == stopNum){
                    return;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
