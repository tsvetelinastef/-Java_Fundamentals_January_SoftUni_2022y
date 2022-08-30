package BasicSyntax_MoreExercise;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double sum = 0;

        boolean isItOutOfMoney = false;

        String command = scanner.nextLine();// преправих ти цикъла, не може да е true и
        // да е хем четим, хем лесно изпълним според мен

        while (!"Game Time".equals(command)) {

            switch (command) {

                case "OutFall 4":
                    //price += 39.99;
                    price = 39.99;

                    // няма смисъл от проверки тук според мен, местя ги накрая
                    //   if (budget < price) {
                    //       System.out.println("Too Expensive");
                    //   } else {
                    //      System.out.println(String.format("Bought %s", command));
                    // }
                    break;

                case "CS: OG":
                    price = 15.99;
                    break;

                case "Zplinter Zell":
                    price = 19.99;
                    break;

                case "Honored 2":
                    price = 59.99;
                    break;

                case "RoverWatch":
                    price = 29.99;
                    //sum = budget - 29.99;
                    break;

                case "RoverWatch Origins Edition":

                    price = 39.99;
                    //sum = budget - 39.99; с така поставено изчисление още на втория вход влиза в out of money
                    //сумирам накрая
                    break;

                default:
                    System.out.println("Not Found");// когато не намери играта ти трябва ново четене,
                    // тоест надолу кода в цикъла ти не трябва да се изпълни.
                    //Можеш да го направиш с boolean или на мен ми харесва така:
                    command = scanner.nextLine();
                    continue;
            }


            if (budget < price) {
                System.out.println("Too Expensive");
            } else {

                System.out.println(String.format("Bought %s", command));
                sum += price;
                budget -= price;
            }

            // само когато сумата не ти стига, поставяме boolean , само ако е нулева тоест

            if (budget == 0) {

                System.out.println("Out of money!");
                isItOutOfMoney = true;
                break;
            }
            command = scanner.nextLine();

        }


        if (!isItOutOfMoney) {

            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, budget);

        }

    }


}
