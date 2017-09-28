import java.util.Scanner;

public class p10_HalfSumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < n ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            if (currentNumber > maxNum){
                maxNum = currentNumber;
            }
        }
        int diff = sum - maxNum;
        if (diff == maxNum ){
            System.out.println("Yes sum = " + maxNum);
        } else {
            System.out.println("No diff = " + Math.abs(maxNum - diff));
        }
    }
}
