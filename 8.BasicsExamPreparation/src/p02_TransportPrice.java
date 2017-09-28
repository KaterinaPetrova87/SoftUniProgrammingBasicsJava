import java.text.DecimalFormat;
import java.util.Scanner;

public class p02_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();

        double transportPrice = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        if (partOfTheDay.equals("day")){
            if (kilometers<20){
                transportPrice = kilometers*0.79+0.70;
            } else if (kilometers >=20&&kilometers<100){
                transportPrice=kilometers*0.09;
            } else if (kilometers >=100){
                transportPrice=kilometers*0.06;
            }
        } else if (partOfTheDay.equals("night")){
            if (kilometers<20){
                transportPrice = kilometers*0.90+0.70;
            } else if (kilometers >=20&&kilometers<100){
                transportPrice=kilometers*0.09;
            } else if (kilometers >=100){
                transportPrice=kilometers*0.06;
            }
        }
        System.out.println(df.format(transportPrice));
    }
}
