import java.util.Scanner;

public class p04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scanner.nextLine());

        double topStudents = 0;
        double studentsBetween4and5 = 0;
        double studentsBetween3and4 = 0;
        double failStudents = 0;
        double average = 0;

        for (int i = 0; i < numOfStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            average += grade;

            if (grade >= 5) {
                topStudents++;
            } else if (grade >= 4 && grade < 5) {
                studentsBetween4and5++;
            } else if (grade >= 3 && grade < 4) {
                studentsBetween3and4++;
            } else if (grade < 3) {
                failStudents++;
            }
        }
        System.out.printf("Top students: %.2f%%\n", topStudents / numOfStudents * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", studentsBetween4and5 / numOfStudents * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", studentsBetween3and4 / numOfStudents * 100);
        System.out.printf("Fail: %.2f%%\n", failStudents / numOfStudents * 100);
        System.out.printf("Average: %.2f", average / numOfStudents);
    }
}
