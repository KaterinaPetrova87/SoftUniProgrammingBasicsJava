import java.util.Scanner;

public class p01_SqareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");

        int a = Integer.parseInt(scanner.nextLine());
        int area = a * a;

        System.out.println("Area = " + area);
    }
}
