import java.util.Scanner;

public class p14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes = minutes + 15;

        if (minutes > 59){
            hour = hour + 1;
            minutes = minutes - 60;
        }if (hour > 23){
            hour = hour - 24;
        }if (minutes < 10){
            System.out.println(hour + ":0" + minutes);
        }else {
            System.out.println(hour + ":" + minutes);
        }
    }
}
