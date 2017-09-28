import java.util.Scanner;

public class p02_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineyardSqareMeters = Integer.parseInt(scanner.nextLine());
        double grapesPerSquareMeter = Double.parseDouble(scanner.nextLine());
        int wineLittersNeeded = Integer.parseInt(scanner.nextLine());
        int numOfWorkers = Integer.parseInt(scanner.nextLine());

        double allGrapes = vineyardSqareMeters * grapesPerSquareMeter;
        double wine = allGrapes * 0.40 / 2.5;

        if (wine < wineLittersNeeded) {
            System.out.println("It will be a tough winter! More " + (int) Math.floor(wineLittersNeeded - wine) + " liters wine needed.");
        } else {
            System.out.println("Good harvest this year! Total wine: " + (int) Math.floor(wine) + " liters.");
            System.out.println((int) Math.ceil(wine - wineLittersNeeded) + " liters left -> "
                    + (int) Math.ceil((wine - wineLittersNeeded) / numOfWorkers) + " liters per person.");
        }
    }
}
