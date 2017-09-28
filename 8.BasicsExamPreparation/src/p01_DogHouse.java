import java.util.Scanner;

public class p01_DogHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideLength = Double.parseDouble(scanner.nextLine());
        double houseHeight = Double.parseDouble(scanner.nextLine());

        double twoSides = sideLength * (sideLength / 2) * 2;
        double square = (sideLength / 2) * (sideLength / 2);
        double triangle = (sideLength / 2 * (houseHeight - sideLength / 2)) / 2;
        double backSide = square + triangle;
        double entrance = (sideLength / 5) * (sideLength / 5);
        double frontSide = backSide - entrance;
        double sidesArea = twoSides + backSide + frontSide;
        double green = sidesArea / 3;
        double roof = sideLength * (sideLength / 2) * 2;
        double red = roof / 5;

        System.out.printf("%.2f\n", green);
        System.out.printf("%.2f", red);

    }
}
