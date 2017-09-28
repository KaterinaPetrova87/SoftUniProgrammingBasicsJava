import java.util.Scanner;

public class p06_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter1 = scanner.nextLine().charAt(0);
        char letter2 = scanner.nextLine().charAt(0);
        char letter3 = scanner.nextLine().charAt(0);

        int counter = 0;

        for (char i = letter1; i <= letter2; i++) {
            for (char j = letter1; j <=letter2 ; j++) {
                for (char k = letter1; k <=letter2 ; k++) {
                    if (i != letter3 && j != letter3 && k != letter3){
                        counter++;
                        System.out.print(""+ i + j + k + " ");
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
