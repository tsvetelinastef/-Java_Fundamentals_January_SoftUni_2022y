package BasicSyntax_MoreExercise;

import java.util.Scanner;

public class ex5_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        StringBuilder word= new StringBuilder();

        for(int i=1; i<=count; i++){

            String number =scanner.nextLine();
            String symbol="";

            switch (number){
                case "0":
                    symbol =" ";
                    break;
                case "2":
                    symbol = "a" ;
                    break;
                case "22":  symbol = "b" ; break;
                case "222":  symbol = "c" ; break;
                case "3":  symbol = "d" ; break;
                case "33":  symbol = "e" ; break;
                case "333":  symbol = "f" ; break;
                case "4":  symbol = "g" ; break;
                case "44":  symbol = "h" ; break;
                case "444":  symbol = "i" ; break;
                case "5": symbol ="j" ; break;
                case "55": symbol ="k" ; break;
                case "555": symbol ="l" ; break;
                case "6": symbol ="m" ; break;
                case "66": symbol ="n" ; break;
                case "666": symbol ="o" ; break;
                case "7": symbol ="p" ; break;
                case "77": symbol ="q" ; break;
                case "777": symbol ="r" ; break;
                case "7777": symbol ="s" ; break;
                case "8": symbol ="t" ; break;
                case "88": symbol ="u" ; break;
                case "888": symbol ="v" ; break;
                case "9": symbol ="w" ; break;
                case "99": symbol ="x" ; break;
                case "999": symbol ="y" ; break;
                case "9999": symbol ="z" ; break;
            }
            word.append(symbol);
        }
        System.out.println(word);
    }
}

/*
public static void main(String[] args) {

      StringBuilder str = new StringBuilder("tutorials ");
      System.out.println("string = " + str);

      // appends the string argument to the StringBuilder
      str.append("point");

      // print the StringBuilder after appending
      System.out.println("After append = " + str);

      str = new StringBuilder("1234 ");
      System.out.println("string = " + str);

      // appends the string argument to the StringBuilder
      str.append("!#$%");

      // print the StringBuilder after appending
      System.out.println("After append = " + str);
   }

 */

