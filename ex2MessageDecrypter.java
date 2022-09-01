import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int message = Integer.parseInt(scanner.nextLine());
        StringBuilder decrippted = new StringBuilder();

        for (int i = 0; i < message; i++) {
            String messageAnother = scanner.nextLine();
            Pattern validMessa = Pattern.compile("^([%|\\$])([A-Z][a-z]{2,})\\1" +
                    "\\:[| ](\\[(\\d+)\\])\\|(\\[(\\d+)\\])\\|(\\[(\\d+)\\])\\|$");
            Matcher mesMatcher = validMessa.matcher(messageAnother);
            if (mesMatcher.find()) {
                for (int j = 4; j < 9; j += 2) {
                    decrippted.append((char) Integer.parseInt(mesMatcher.group(j)));
                }
                System.out.println(mesMatcher.group(2) + ": " + decrippted);
                decrippted.delete(0, decrippted.length());
            } else {
                System.out.println("Valid message not found!");
            }
        }


    }
}
