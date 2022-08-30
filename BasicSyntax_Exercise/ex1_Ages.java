package BasicSyntax_Exercise;

import java.util.Scanner;

public class ex1_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String person = " ";
        if ( age >= 0 && age <= 2){
            person = "baby";
        } else if ( age >= 3 && age <= 13){
            person = "child";
        } else if (age >= 14 && age <= 19){
            person = "teenager";
        }else if (age >= 20 && age <= 65) {
            person = "adult";
        }else if (age >= 66) {
            person = "elder";
        }

        System.out.println(person);

        // решение на лектора

    }
}


/*

        int personAge = Integer.parseInt(scanner.nextLine());
        if ( personAge >= 0 && personAge <= 2){
            System.out.println("baby");
        } else if ( personAge >= 3 && personAge <= 13){
            System.out.println("child");
        } else if (personAge >= 14 && personAge <= 19){
            System.out.println("teenager");
        }else if (personAge >= 20 && personAge <= 65) {
            System.out.println("adult");
        }else if (personAge >= 66) {
            System.out.println("elder");
        }

 */
