package RegularExpressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex6_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String regex = "(?<=\\s)[a-zA-Z0-9]+([-.]\\w+)*@[a-zA-Z]+?([.-][a-zA-Z]*)*(\\.[a-z]{2,})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

/*
 String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("[\\w-.]+@([\\w-]+\\.)+[\\w-]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
 */
