import java.util.Scanner;

public class p01_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double houseHeight = Double.parseDouble(scanner.nextLine());
        double sideLength = Double.parseDouble(scanner.nextLine());
        double triangleSideHeight = Double.parseDouble(scanner.nextLine());

        double sideArea = houseHeight * sideLength;
        double windowArea = 1.5 * 1.5;
        double twoSides = sideArea * 2 - windowArea * 2;
        double backSide = houseHeight * houseHeight;
        double entrance = 1.2 * 2;
        double backAndFrontSides = 2 * backSide - entrance;
        double totalArea = twoSides + backAndFrontSides;

        double green = totalArea / 3.4;

        double triangleRoof = 2 * (houseHeight * triangleSideHeight / 2);
        double rectangleRoof = 2 * (houseHeight * sideLength);
        double roofArea = triangleRoof + rectangleRoof;

        double red = roofArea / 4.3;

        System.out.printf("%.2f\n",green);
        System.out.printf("%.2f",red);
    }
}
