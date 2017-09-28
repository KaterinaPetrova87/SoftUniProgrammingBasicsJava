import java.util.Scanner;

public class p01_GrapeAndRakia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vineyardArea = Double.parseDouble(scanner.nextLine());
        double grapesPerSquareMeter = Double.parseDouble(scanner.nextLine());
        double wastage = Double.parseDouble(scanner.nextLine());

        double grapesKg = vineyardArea*grapesPerSquareMeter;
        double totalGrapesKg = grapesKg - wastage;
        double grapesForRakia = totalGrapesKg*0.45;
        double rakia = grapesForRakia/7.5;
        double incomeFromRakia = rakia*9.80;
        double grapesForSale = totalGrapesKg*0.55;
        double incomeFromGrapes = grapesForSale*1.50;

        System.out.printf("%.2f\n", incomeFromRakia);
        System.out.printf("%.2f", incomeFromGrapes);
    }
}
