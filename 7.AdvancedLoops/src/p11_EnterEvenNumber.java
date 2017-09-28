import java.util.Scanner;

public class p11_EnterEvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isEven = true;

        while (isEven) {
            System.out.print("Enter even number: ");
            n = Integer.parseInt(scanner.nextLine());
            try {
                if (n % 2 == 0) {
                    isEven = true;
                    break;
                }
            } catch (Exception ex) {
                if (n % 2 != 0) {
                    isEven = false;
                    System.out.println("Invalid number!");
                    break;
                }
            }
            if (isEven) {
                System.out.println("Even number entered: " + n);
            } else {
                System.out.println("The number is not even.");
            }
        }
    }
}
