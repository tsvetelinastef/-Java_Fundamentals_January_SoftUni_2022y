package BasicSyntax_MoreExercise;

import java.util.Scanner;

public class ex4_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine(); // String str = "Geeks", nstr="";
        String nstr = "";
        char ch;

       // System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the
            // existing string
        }
        System.out.println(nstr);
       // System.out.println("Reversed word: " + nstr);
    }

}
