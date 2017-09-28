import java.util.Scanner;

public class p01_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workdaysPerMonth = Integer.parseInt(scanner.nextLine());
        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double usdCourse = Double.parseDouble(scanner.nextLine());

        double salaryPerMonth = workdaysPerMonth * moneyPerDay;
        double incomePerYear = (salaryPerMonth * 12) + (salaryPerMonth * 2.5);
        double tax = incomePerYear * 0.25;
        double totalIncomePerYearInLeva = (incomePerYear - tax) * usdCourse;
        double averageIncomePerDay = totalIncomePerYearInLeva / 365;

        System.out.printf("%.2f", averageIncomePerDay);
    }
}
