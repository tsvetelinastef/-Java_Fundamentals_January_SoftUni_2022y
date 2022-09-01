package TextProcessing_LAB;

import java.util.Scanner;

public class ex3_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        StringBuilder output = new StringBuilder(scanner.nextLine());
        int index;

        while ((index = output.indexOf(word)) != -1) {
            output.delete(index, index + word.length());
        }
        System.out.println(output);


    }
}

