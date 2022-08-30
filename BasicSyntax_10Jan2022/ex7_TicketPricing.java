package BasicSyntax_10Jan2022;

import java.util.Scanner;

public class ex7_TicketPricing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        //  double price = 0.0;
        String price = "Error!";

        if (typeOfDay.equals("Weekday")){
            if ((0 <= age && age <= 18) || (64 < age && age <= 122)){
                price = "12$";
            } else if (18 < age && age <= 64){
                price = "18$";
            }
        } else if (typeOfDay.equals("Weekend")){
            if ((0 <= age && age <= 18) || (64 < age && age <= 122)){
                price = "15$";
            } else if (18 < age && age <= 64){
                price = "20$";
            }
        } else if(typeOfDay.equals("Holiday")){
            if (0 <= age && age <= 18){
                price = "5$";
            } else if (18 < age && age <= 64){
                price = "12$";
            } else if (64 < age && age <= 122){
                price = "10$";
            }
        }

        System.out.println(price);

    }

}
