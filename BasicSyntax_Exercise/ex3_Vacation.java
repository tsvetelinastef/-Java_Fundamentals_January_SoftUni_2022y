package BasicSyntax_Exercise;

import java.util.Scanner;

public class ex3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 91/100 точки в Judge
        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfTheGroup = scanner.nextLine();
        String dayOfTheWeekToStay = scanner.nextLine();

        double price = 0.0;

        if (typeOfTheGroup.equals("ex5_Student")) {
            if (groupOfPeople >= 30) {
                if (dayOfTheWeekToStay.equals("Friday")) {
                    price = ((groupOfPeople * 8.45) - (0.15 * (groupOfPeople * 8.45)));

                    System.out.printf("Total price: %.2f%n", price);
                } else if (dayOfTheWeekToStay.equals("Saturday")) {
                    price = ((groupOfPeople * 9.80) - (0.15 * (groupOfPeople * 9.80)));
                    System.out.printf("Total price: %.2f%n", price);
                } else if (dayOfTheWeekToStay.equals("Sunday")) {
                    price = ((groupOfPeople * 10.46) - (0.15 * (groupOfPeople * 10.46)));
                    System.out.printf("Total price: %.2f%n", price);
                }
            } else {
                if (dayOfTheWeekToStay.equals("Friday")) {
                    price = groupOfPeople * 8.45;
                    System.out.printf("Total price: %.2f%n", price);
                } else if (dayOfTheWeekToStay.equals("Saturday")) {
                    price = groupOfPeople * 9.80;
                    System.out.printf("Total price: %.2f%n", price);
                } else if (dayOfTheWeekToStay.equals("Sunday")) {
                    price = groupOfPeople * 10.46;
                    System.out.printf("Total price: %.2f%n", price);
                }
            }




        } else if (typeOfTheGroup.equals("Business")) {
            if (groupOfPeople >= 100) {

                // 10 of them can stay for free
                if (dayOfTheWeekToStay.equals("Friday")) {
                    price = (groupOfPeople - 10) * 10.90;
                    System.out.printf("Total price: %.2f%n", price);

                } else if (dayOfTheWeekToStay.equals("Saturday")) {
                    price = (groupOfPeople - 10) * 15.60;
                    System.out.printf("Total price: %.2f%n", price);

                } else if (dayOfTheWeekToStay.equals("Sunday")) {
                    price = (groupOfPeople - 10) * 16;
                    System.out.printf("Total price: %.2f%n", price);
                }
            } else {
                if (dayOfTheWeekToStay.equals("Friday")) {
                    price = groupOfPeople * 10.90;
                    System.out.printf("Total price: %.2f%n", price);
                } else if (dayOfTheWeekToStay.equals("Saturday")) {
                    price = groupOfPeople * 15.60;
                    System.out.printf("Total price: %.2f%n", price);
                } else if (dayOfTheWeekToStay.equals("Sunday")) {
                    price = groupOfPeople * 16;
                    System.out.printf("Total price: %.2f%n", price);
                }
            }




        } else if (typeOfTheGroup.equals("Regular")) {
            if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                if (dayOfTheWeekToStay.equals("Friday")) {
                    price = ((groupOfPeople * 8.45) - (0.05 * (groupOfPeople * 8.45)));

                    System.out.printf("Total price: %.2f%n", price);
                } else if (dayOfTheWeekToStay.equals("Saturday")) {
                    price = ((groupOfPeople * 9.80) - (0.05 * (groupOfPeople * 9.80)));
                    System.out.printf("Total price: %.2f%n", price);
                } else if (dayOfTheWeekToStay.equals("Sunday")) {
                    price = ((groupOfPeople * 10.46) - (0.05 * (groupOfPeople * 10.46)));
                    System.out.printf("Total price: %.2f%n", price);
                }
            } else{
                if (dayOfTheWeekToStay.equals("Friday")) {
                    price = groupOfPeople * 15;
                    System.out.printf("Total price: %.2f%n", price);
                } else if (dayOfTheWeekToStay.equals("Saturday")) {
                    price = groupOfPeople * 20;
                    System.out.printf("Total price: %.2f%n", price);
                } else if (dayOfTheWeekToStay.equals("Sunday")) {
                    price = groupOfPeople * 22.50;
                    System.out.printf("Total price: %.2f%n", price);
                }
            }

        }




    }
}

/*
--------------------------------------------------------------------------
int num = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();

        double totalPrice = 0;
        double price = 0;

        switch (type) {
            case "ObjectsAndClasses.ex5_Student":
                switch (day) {
                    case "Friday": price = 8.45;   break;
                    case "Saturday": price = 9.80; break;
                    case "Sunday": price = 10.46;  break;
                }
                totalPrice = price * num;
                if (num >= 30) {
                    totalPrice *= 0.85;
                }
                break;
 //////////////////////////////////////////////////////////////////////
            case "Business":
                switch (day) {
                    case "Friday": price = 10.90;   break;
                    case "Saturday": price = 15.60; break;
                    case "Sunday": price = 16.00;   break;
                }
                if (num >= 100) {
                    num -= 10;
                }
                totalPrice = price * num;
                break;
////////////////////////////////////////////////////////////////////////
            case "Regular":
                switch (day) {
                    case "Friday": price = 15.00;   break;
                    case "Saturday": price = 20.00; break;
                    case "Sunday": price = 22.50;   break;
                }
                totalPrice = price * num;
                if (num >= 10 && num <= 20) {
                    totalPrice *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }

 */