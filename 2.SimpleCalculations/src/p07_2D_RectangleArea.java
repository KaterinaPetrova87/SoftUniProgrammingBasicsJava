import java.util.Scanner;

public class p07_2D_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double deltaX = Math.abs(x1 - x2);
        double deltaY = Math.abs(y1 - y2);

        double area = deltaX * deltaY;
        double perimeter = 2 * deltaX + 2 * deltaY;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
