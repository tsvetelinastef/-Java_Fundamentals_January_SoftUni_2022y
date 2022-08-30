package BasicSyntax_10Jan2022;

import java.util.Scanner;

public class ex3_PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        //  if (grade >= 2.99){
        //      System.out.println("Passed!");
        //  } else if(grade <= 3.00){
        //      System.out.println("Failed!");
        //  }
        // така написан тоя код ми дава 80 от 100

        if (grade >= 3.00) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

    }

}
