package TextProcessing_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ex1_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         Arrays.stream(scanner.nextLine().split(", "))
                 .filter(ex1_ValidUsernames::isValid).forEach(System.out::println);
    }
    static boolean isValid(String username){
        return username.matches("[a-zA-Z0-9\\-_]{3,16}");
    }
}
