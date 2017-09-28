import java.util.Scanner;

public class p04_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moves = Double.parseDouble(scanner.nextLine());

        double scores = 0;
        double resultFrom0To9 = 0;
        double resultFrom10To19 = 0;
        double resultFrom20To29 = 0;
        double resultFrom30To39 = 0;
        double resultFrom40To50 = 0;
        double invalidNumbers = 0;

        for (int i = 0; i < moves; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (number >= 0 && number < 10) {
                resultFrom0To9++;
                scores += number * 0.20;
            } else if (number >= 10 && number < 20) {
                resultFrom10To19++;
                scores += number * 0.30;
            } else if (number >= 20 && number < 30) {
                resultFrom20To29++;
                scores += number * 0.40;
            } else if (number >= 30 && number < 40) {
                resultFrom30To39++;
                scores += 50;
            } else if (number >= 40 && number <= 50) {
                resultFrom40To50++;
                scores += 100;
            } else {
                invalidNumbers++;
                scores = scores / 2;
            }
        }
        System.out.printf("%.2f\n", scores);
        System.out.printf("From 0 to 9: %.2f%%\n", resultFrom0To9/moves*100);
        System.out.printf("From 10 to 19: %.2f%%\n", resultFrom10To19/moves*100);
        System.out.printf("From 20 to 29: %.2f%%\n", resultFrom20To29/moves*100);
        System.out.printf("From 30 to 39: %.2f%%\n", resultFrom30To39/moves*100);
        System.out.printf("From 40 to 50: %.2f%%\n", resultFrom40To50/moves*100);
        System.out.printf("Invalid numbers: %.2f%%", invalidNumbers/moves*100);
    }
}
