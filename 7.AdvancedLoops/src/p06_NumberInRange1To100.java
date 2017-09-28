import java.util.Scanner;

public class p06_NumberInRange1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        boolean isInputValid = input < 1 || input >100;

        while (isInputValid){
            System.out.println("Invalid number!");
            System.out.print("Еnter a number in the range [1...100]: ");
            input = Integer.parseInt(scanner.nextLine());
            isInputValid = input < 1 || input >100;
        }
        System.out.println("The number is: " + input);
    }
}
