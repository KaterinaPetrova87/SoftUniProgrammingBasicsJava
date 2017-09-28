import java.util.Scanner;

public class p13_AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double base1 = Double.parseDouble(scanner.nextLine());

        if (figure.equals("square")) {
            double area = (base1 * base1);
            //double area = Math.pow (square, 2);
            System.out.printf("%.3f",area);
        } else if (figure.equals("rectangle")) {
            double base2 = Double.parseDouble(scanner.nextLine());
            double area = (base1 * base2);
            System.out.printf("%.3f",area);
        } else if (figure.equals("circle")) {
            double area = (Math.PI * base1 * base1);
            System.out.printf("%.3f",area);
        } else if (figure.equals("triangle")) {
            double base2 = Double.parseDouble(scanner.nextLine());
            double area = ((base1 * base2) / 2);
            System.out.printf("%.3f",area);
        }
    }
}