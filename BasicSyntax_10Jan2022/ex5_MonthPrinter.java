package BasicSyntax_10Jan2022;

import java.util.Scanner;

public class ex5_MonthPrinter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());


        if (integer == 1) {
            System.out.println("January");
        } else if (integer == 2 ) {
            System.out.println("February");
        } else if (integer == 3 ) {
            System.out.println("March");
        } else if (integer == 4 ) {
            System.out.println("April");
        } else if (integer == 5 ) {
            System.out.println("May");
        } else if (integer == 6 ) {
            System.out.println("June");
        } else if (integer == 7 ) {
            System.out.println("July");
        } else if (integer == 8) {
            System.out.println("August");
        } else if (integer == 9) {
            System.out.println("September");
        } else if (integer == 10) {
            System.out.println("October");
        } else if (integer == 11) {
            System.out.println("November");
        } else if (integer == 12) {
            System.out.println("December");
        } else {
            System.out.println("Error!");
        }


    }
}
