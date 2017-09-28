import java.util.Scanner;

public class p08_OddEvenSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }
        }
        if (evenSum - oddSum == 0){
            System.out.println("Yes sum = " + evenSum);
        } else {
            System.out.println("No diff = " + Math.abs(evenSum - oddSum));
        }
    }
}
