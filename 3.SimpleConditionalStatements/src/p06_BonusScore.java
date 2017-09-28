import java.util.Scanner;

public class p06_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0;

        if (score <= 100){
            bonusScore = 5;
        }else if (score <= 1000){
            bonusScore = score * 0.2;
        }else {
            bonusScore = score * 0.1;
        }if (score % 2 == 0){
            bonusScore = bonusScore + 1; // bonusScore++
        }if (score % 10 == 5){
            bonusScore = bonusScore + 2;
        }
        System.out.println(bonusScore);
        System.out.println(score + bonusScore);
    }
}
