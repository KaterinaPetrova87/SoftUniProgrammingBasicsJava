import java.util.Scanner;

public class p07_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());

        int sumTime = time1 + time2 + time3;
        int minutes = sumTime / 60;
        int secondsRemaining = sumTime % 60;
        //System.out.printf("%d:%02d, minutes, secondsRemaining")

        if (secondsRemaining < 10){
            System.out.println(minutes + ":0" + secondsRemaining);
        }else {
            System.out.println(minutes + ":" + secondsRemaining);
        }
    }
}
