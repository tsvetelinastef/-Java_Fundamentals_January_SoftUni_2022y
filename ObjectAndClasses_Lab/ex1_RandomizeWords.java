package ObjectAndClasses_Lab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ex1_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");
        // масив

        Random r = new Random(); // from Stackoverflow


        for (int i = 0; i < text.length; i++) {
            int x = r.nextInt(text.length);
            int y = r.nextInt(text.length);
            String old = text[x];      // int a = ar[index];
            text[x] = text[y];         // ar[index] = ar[i];
            text[y] = old;             // ar[i] = a;

        }

        Arrays.stream(text).forEach(System.out::println);
    }
}


