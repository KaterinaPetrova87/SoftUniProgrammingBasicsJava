import java.util.Scanner;

public class p08_MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String inType = scanner.nextLine();
        String outType = scanner.nextLine();

        double millimeters = 1000;
        double centimeters = 100;
        double miles = 0.000621371192;
        double inches = 39.3700787;
        double kilometers = 0.001;
        double feet = 3.2808399;
        double yards = 1.0936133;

        if (inType.equals("mm")){
            number = number / millimeters;
        }else if (inType.equals("cm")){
            number = number / centimeters;
        }else if (inType.equals("mi")){
            number = number / miles;
        }else if (inType.equals("in")){
            number = number / inches;
        }else if (inType.equals("km")){
            number = number / kilometers;
        }else if (inType.equals("ft")){
            number = number / feet;
        }else if (inType.equals("yd")){
            number = number / yards;
        }
        if (outType.equals("mm")){
            number = number * millimeters;
        }else if (outType.equals("cm")){
            number = number * centimeters;
        }else if (outType.equals("mi")){
            number = number * miles;
        }else if (outType.equals("in")){
            number = number * inches;
        }else if (outType.equals("km")){
            number = number * kilometers;
        }else if (outType.equals("ft")){
            number = number * feet;
        }else if (outType.equals("yd")) {
            number = number * yards;
        }
        System.out.printf("%f %s", number, outType);
    }
}
