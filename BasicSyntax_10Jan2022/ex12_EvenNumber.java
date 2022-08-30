package BasicSyntax_10Jan2022;

import java.util.Scanner;

public class ex12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // int evenNumber = scanner.nextInt();
        int evenNumber = Integer.parseInt(scanner.nextLine());


        while(true) {
            if (evenNumber % 2 == 0) {
                System.out.println("The number is: " + Math.abs(evenNumber));
                break;
            }
            System.out.println("Please write an even number.");
            evenNumber = Integer.parseInt(scanner.nextLine());
        }


    }
}



        //  for (int i = 0; i < evenNumber ; i++) {
       //     System.out.printf("The number is: %d%n", Math.abs(evenNumber));
        // }


      // System.out.printf("The number is: %d%n", Math.abs(evenNumber));

       //  if (evenNumber ){
       //  }


          // int[] vars = new int[3];
          //
          //for(int i = 0; i < vars.length; i++) {
          //  System.out.println("Enter next var: ");
          //  vars[i] = dd.nextInt();
          //}


/*

// this didn't work!!
if(evenNumber % 2 == 0){
            System.out.println("The number is: " + Math.abs(evenNumber));
        } else {
            System.out.println("Please write an even number.");
           // evenNumber = Integer.parseInt(scanner.nextLine());
        }
 */