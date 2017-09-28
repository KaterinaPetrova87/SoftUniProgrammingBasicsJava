import java.util.Scanner;

public class p06_MaxCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int maxCombinations = Integer.parseInt(scanner.nextLine());

        int combinations = 0;

        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                combinations++;
                System.out.printf("<%d-%d>",i,j);
                if (combinations >= maxCombinations){
                    return;
                }
            }
        }
    }
}
