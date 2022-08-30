package BasicSyntax_MoreExercise;

import java.util.Scanner;

public class ex1_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());


        if (numberOne >= numberTwo && numberOne >= numberThree) {
            if (numberTwo >= numberThree) {
                //System.out.printf("%d%n %d%n %d%n", numberOne, numberTwo, numberThree);
                //   print(f"Descending: {num1} {num2} {num3}");
                System.out.println(numberOne);
                System.out.println(numberTwo);
                System.out.println(numberThree);
            } else {
               // System.out.printf("%d%n %d%n %d%n", numberOne, numberThree, numberTwo);
                // print(f"Descending: {num1} {num3} {num2}");
                System.out.println(numberOne);
                System.out.println(numberThree);
                System.out.println(numberTwo);
            }   // for num 2 is the greatest



        } else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            if (numberOne >= numberThree) {
                // print(f"Descending: {num2} {num1} {num3}")
                //System.out.printf("%d%n %d%n %d%n", numberTwo, numberOne, numberThree);
                System.out.println(numberTwo);
                System.out.println(numberOne);
                System.out.println(numberThree);
            } else {
               // System.out.printf("%d%n %d%n %d%n", numberTwo, numberThree, numberOne);
               // print(f"Descending: {num2} {num3} {num1}")
                System.out.println(numberTwo);
                System.out.println(numberThree);
                System.out.println(numberOne);
            }

        }


        // for num 3 is the greatest
        else{
            if (numberTwo >= numberOne){
                //System.out.printf("%d%n %d%n %d%n", numberThree, numberTwo, numberOne);
                //print(f"Descending: {num3} {num2} {num1}")
                System.out.println(numberThree);
                System.out.println(numberTwo);
                System.out.println(numberOne);
            } else{
               // System.out.printf("%d%n %d%n %d%n", numberThree, numberOne, numberTwo);
                //print(f"Descending: {num3} {num1} {num2}")
                System.out.println(numberThree);
                System.out.println(numberOne);
                System.out.println(numberTwo);
            }
        }



    }
}

