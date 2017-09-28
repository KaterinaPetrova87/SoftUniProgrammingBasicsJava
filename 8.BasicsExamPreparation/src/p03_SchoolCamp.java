import java.util.Scanner;

public class p03_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeOfGroup = scanner.nextLine();
        int numOfStudents = Integer.parseInt(scanner.nextLine());
        int numOfNights = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (season.equals("Winter")) {
            if (typeOfGroup.equals("girls")) {
                totalPrice = 9.60 * numOfNights * numOfStudents;
                if (numOfStudents >= 50) {
                    totalPrice = totalPrice - totalPrice * 0.5;
                } else if (numOfStudents >= 20 && numOfStudents < 50) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                } else if (numOfStudents >= 10 && numOfStudents < 20) {
                    totalPrice = totalPrice - totalPrice * 0.05;
                }
                System.out.printf("Gymnastics %.2f lv.", totalPrice);
            } else if (typeOfGroup.equals("boys")) {
                totalPrice = 9.60 * numOfNights * numOfStudents;
                if (numOfStudents >= 50) {
                    totalPrice = totalPrice - totalPrice * 0.5;
                } else if (numOfStudents >= 20 && numOfStudents < 50) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                } else if (numOfStudents >= 10 && numOfStudents < 20) {
                    totalPrice = totalPrice - totalPrice * 0.05;
                }
                System.out.printf("Judo %.2f lv.", totalPrice);
            } else if (typeOfGroup.equals("mixed")) {
                totalPrice = 10 * numOfNights * numOfStudents;
                if (numOfStudents >= 50) {
                    totalPrice = totalPrice - totalPrice * 0.5;
                } else if (numOfStudents >= 20 && numOfStudents < 50) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                } else if (numOfStudents >= 10 && numOfStudents < 20) {
                    totalPrice = totalPrice - totalPrice * 0.05;
                }
                System.out.printf("Ski %.2f lv.", totalPrice);
            }
        } else if (season.equals("Spring")) {
            if (typeOfGroup.equals("girls")) {
                totalPrice = 7.20 * numOfNights * numOfStudents;
                if (numOfStudents >= 50) {
                    totalPrice = totalPrice - totalPrice * 0.5;
                } else if (numOfStudents >= 20 && numOfStudents < 50) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                } else if (numOfStudents >= 10 && numOfStudents < 20) {
                    totalPrice = totalPrice - totalPrice * 0.05;
                }
                System.out.printf("Athletics %.2f lv.", totalPrice);
            } else if (typeOfGroup.equals("boys")) {
                totalPrice = 7.20 * numOfNights * numOfStudents;
                if (numOfStudents >= 50) {
                    totalPrice = totalPrice - totalPrice * 0.5;
                } else if (numOfStudents >= 20 && numOfStudents < 50) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                } else if (numOfStudents >= 10 && numOfStudents < 20) {
                    totalPrice = totalPrice - totalPrice * 0.05;
                }
                System.out.printf("Tennis %.2f lv.", totalPrice);
            } else if (typeOfGroup.equals("mixed")) {
                totalPrice = 9.50 * numOfNights * numOfStudents;
                if (numOfStudents >= 50) {
                    totalPrice = totalPrice - totalPrice * 0.5;
                } else if (numOfStudents >= 20 && numOfStudents < 50) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                } else if (numOfStudents >= 10 && numOfStudents < 20) {
                    totalPrice = totalPrice - totalPrice * 0.05;
                }
                System.out.printf("Cycling %.2f lv.", totalPrice);
            }
        } else if (season.equals("Summer")) {
            if (typeOfGroup.equals("girls")) {
                totalPrice = 15 * numOfNights * numOfStudents;
                if (numOfStudents >= 50) {
                    totalPrice = totalPrice - totalPrice * 0.5;
                } else if (numOfStudents >= 20 && numOfStudents < 50) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                } else if (numOfStudents >= 10 && numOfStudents < 20) {
                    totalPrice = totalPrice - totalPrice * 0.05;
                }
                System.out.printf("Volleyball %.2f lv.", totalPrice);
            } else if (typeOfGroup.equals("boys")) {
                totalPrice = 15 * numOfNights * numOfStudents;
                if (numOfStudents >= 50) {
                    totalPrice = totalPrice - totalPrice * 0.5;
                } else if (numOfStudents >= 20 && numOfStudents < 50) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                } else if (numOfStudents >= 10 && numOfStudents < 20) {
                    totalPrice = totalPrice - totalPrice * 0.05;
                }
                System.out.printf("Football %.2f lv.", totalPrice);
            } else if (typeOfGroup.equals("mixed")) {
                totalPrice = 20 * numOfNights * numOfStudents;
                if (numOfStudents >= 50) {
                    totalPrice = totalPrice - totalPrice * 0.5;
                } else if (numOfStudents >= 20 && numOfStudents < 50) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                } else if (numOfStudents >= 10 && numOfStudents < 20) {
                    totalPrice = totalPrice - totalPrice * 0.05;
                }
                System.out.printf("Swimming %.2f lv.", totalPrice);
            }
        }
    }
}
