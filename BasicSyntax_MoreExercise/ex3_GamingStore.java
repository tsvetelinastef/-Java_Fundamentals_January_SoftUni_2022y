package BasicSyntax_MoreExercise;

import java.util.Scanner;

public class ex3_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
// MOI KOD ,  NE STAVA!!!!!!!!!!!!!!!!!!!!!!!!!

        // Когато се купи игра, потребителят балансът намалява с цената на играта.

        double totalSpent = 0.0;
        double remainingMoney = 0.0;
        String command = scanner.nextLine();
        if (!"Game Time".equals(command)) {
            if (command.equals("OutFall 4")) {
                remainingMoney = currentBalance - 39.99;
                totalSpent += 39.99;
                System.out.println("Bought OutFall 4");

            } else if (command.equals("CS: OG")) {
                remainingMoney = currentBalance - 15.99;
                totalSpent += 15.99;
                System.out.println("Bought CS: OG");

            } else if (command.equals("Zplinter Zell")) {
                remainingMoney = currentBalance - 19.99;
                totalSpent += 19.99;
                System.out.println("Bought Zplinter Zell");

            } else if (command.equals("Honored 2")) {
                remainingMoney = currentBalance - 59.99;
                totalSpent += 59.99;
                System.out.println("Bought Honored 2");

            } else if (command.equals("RoverWatch")) {
                remainingMoney = currentBalance - 29.99;
                totalSpent += 29.99;
                System.out.println("Bought RoverWatch");

            } else if (command.equals("RoverWatch Origins Edition")) {
                remainingMoney = currentBalance - 39.99;
                totalSpent += 39.99;
                System.out.println("Bought RoverWatch Origins Edition");
            } //else {
              //  System.out.println("Not Found");
           // }
          //  if (totalSpent < 15.99){
          //      System.out.println("Too Expensive");
          //  }




        } else {
            //  print the user’s remaining money and total spent on games,
            //  rounded to the 2nd decimal place
            System.out.printf("Total spent: $%.2f.", totalSpent);
            System.out.printf("Remaining: $%.2f", remainingMoney);

        } // if (remainingMoney == 0) {
          //  System.out.println("Out of money!");
       // }


    }
}

// 1... If a game the user is trying to buy is not present in the table above,
// print "Not Found" and read the next line.
// 2... currentBalance == "0$" , s out("Out of money!") , end the program
// 3... Alternatively, if the user is trying to buy a game that they can’t afford, print "Too Expensive" and read
//the next line

