import java.util.Scanner;

public class p08_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int factorial = 1;

       while (n>0){
           factorial*=n;
           n--;
       }
        System.out.println(factorial);
    }
}
