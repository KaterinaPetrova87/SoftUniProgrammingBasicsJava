import java.util.Scanner;

public class p01_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gander = scanner.nextLine();

        if (gander.equals("f")){
            if (age < 16){
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else if (gander.equals("m")){
            if (age < 16){
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        }

    }
}


