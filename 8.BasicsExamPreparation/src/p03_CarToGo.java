import java.util.Scanner;

public class p03_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        String typeCar = "";
        String classCar = "";

        if (season.equals("Summer")){
            if (budget<=100){
                classCar = "Economy class";
                typeCar = "Cabrio";
                price = budget*35/100;
            } else if (budget > 100 && budget <=500){
                classCar = "Compact class";
                typeCar = "Cabrio";
                price = budget*45/100;
            } else if (budget > 500){
                classCar = "Luxury class";
                typeCar = "Jeep";
                price = budget*90/100;
            }
        } else if (season.equals("Winter")){
            if (budget<=100){
                classCar = "Economy class";
                typeCar = "Jeep";
                price = budget*65/100;
            } else if (budget > 100 && budget <=500){
                classCar = "Compact class";
                typeCar = "Jeep";
                price = budget*80/100;
            } else if (budget > 500){
                classCar = "Luxury class";
                typeCar = "Jeep";
                price = budget*90/100;
            }
        }
        System.out.printf("%s\n",classCar);
        System.out.printf("%s - %.2f", typeCar, price);
    }
}
