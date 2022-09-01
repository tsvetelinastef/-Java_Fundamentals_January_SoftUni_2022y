package RegularExpressions_Exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("[>]{2}(?<name>[\\w]+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)");
        List<String> purchases = new LinkedList<>();
        double totalMoney = 0;
        while (!line.equals("Purchase")) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                double quantity = Double.parseDouble(matcher.group("quantity"));
                purchases.add(name);
                totalMoney += price * quantity;
            }
            line = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        purchases.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalMoney);
    }
}

/*
        Pattern pattern = Pattern.compile("[>]{2}(?<name>[A-Za-z]+)[<]{2}(?<price>[\\d]+[.]?[\\d]+?)[!](?<quantity>[\\d]+)");
        double sum = 0;
        String input;

        System.out.println("Bought furniture:");

        while (!"Purchase".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                System.out.println(matcher.group("name"));
                sum += Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
            }
        }
        System.out.printf("Total money spend: %.2f", sum);
 */
