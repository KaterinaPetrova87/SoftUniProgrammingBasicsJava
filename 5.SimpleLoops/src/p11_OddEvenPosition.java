import java.text.DecimalFormat;
import java.util.Scanner;

public class p11_OddEvenPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenSum = 0;
        double oddSum = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (!(i % 2 == 0)) {
                oddSum += number;
                if (number >= oddMax) {
                    oddMax = number;
                }
                if (number <= oddMin) {
                    oddMin = number;
                }
            } else if (i % 2 == 0) {
                evenSum += number;
                if (number >= evenMax) {
                    evenMax = number;
                }
                if (number <= evenMin) {
                    evenMin = number;
                }
            }
        }
        if (n == 1) {
            System.out.println("OddSum="+ df.format(oddSum));
            System.out.println("OddMin="+ df.format(oddMin));
            System.out.println("OddMax="+ df.format(oddMax));
            System.out.println("EvenSum=0");
            System.out.println("EvenMin=No");
            System.out.println("EvenMax=No");
        } else if (n == 0) {
            System.out.println("OddSum=0");
            System.out.println("OddMin=No");
            System.out.println("OddMax=No");
            System.out.println("EvenSum=0");
            System.out.println("EvenMin=No");
            System.out.println("EvenMax=No");
        } else {
            System.out.println("OddSum="+ df.format(oddSum));
            System.out.println("OddMin="+ df.format(oddMin));
            System.out.println("OddMax="+ df.format(oddMax));
            System.out.println("EvenSum="+ df.format(evenSum));
            System.out.println("EvenMin="+ df.format(evenMin));
            System.out.println("EvenMax="+ df.format(evenMax));
        }
    }
}

