package BasicSyntax_10Jan2022;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
        int length = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

      //  int sum = sum % 4;
       // double sum = 0.0;
        int sum = 0;
        for(int i = 0; i < length; i++) {
            if(array[i] % 4 == 0){
                sum += array[i];
            }
        }
        System.out.println(sum);
 */
        int result = 0;

        for (int i = 0; i < 5; i++) {

            if (i == 3) {

                result += 10;

            } else {

                result += i;

            }

        }

        System.out.println(result);
    }
}

/*
 double sum = 0.0;
       if(array[i] % 4 == 0){
           sum += array[i];
       }
       System.out.println(sum);
   }
 */

