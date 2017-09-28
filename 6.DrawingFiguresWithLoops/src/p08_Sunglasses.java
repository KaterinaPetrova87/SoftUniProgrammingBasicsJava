import java.util.Scanner;

public class p08_Sunglasses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString("*", 2*n) + repeatString(" ", n)
                + repeatString("*",2*n));

        for (int i = 0; i < n-2 ; i++) {
            if (i == (n-1)/2-1){
                System.out.println("*" + repeatString("/", 2*n-2) + "*" + repeatString("|", n)
                        + "*" + repeatString("/", 2*n-2) + "*");
            } else {
                System.out.println("*" + repeatString("/", 2*n-2) + "*" + repeatString(" ", n)
                        + "*" + repeatString("/", 2*n-2) + "*");
            }
        }
        System.out.println(repeatString("*", 2*n) + repeatString(" ", n)
                + repeatString("*",2*n));
    }

    public static String repeatString(String text, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += text;
        }
        return result;
    }
}
