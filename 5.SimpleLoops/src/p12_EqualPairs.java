import java.util.Scanner;

public class p12_EqualPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int prevSum = 0;
        int nextSum = 0;
        int diff = 0;
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (i == 0) {
                prevSum = num1 + num2;
            } else {
                nextSum = num1 + num2;
                diff = Math.abs(nextSum - prevSum);
                if (diff > maxDiff){
                    maxDiff = diff;
                }
                prevSum = nextSum;
            }
        }
        if (maxDiff == 0){
            System.out.println("Yes, value=" + prevSum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
