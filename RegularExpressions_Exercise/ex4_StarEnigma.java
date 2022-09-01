package RegularExpressions_Exercise;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex4_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyRegex = "[starSTAR]";
        Pattern keyPattern = Pattern.compile(keyRegex);

        String messageRegex = "^[^@\\-!:>]*@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>[\\d]+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldierCount>\\d+)[^@\\-!:>]*$";
        Pattern messagePattern = Pattern.compile(messageRegex);
        List<String> attacked = new LinkedList<>();
        List<String> destroyed = new LinkedList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            Matcher keyMatcher = keyPattern.matcher(message);
            int count = 0;
            while (keyMatcher.find()) {
                count++;
            }
            StringBuilder sb = new StringBuilder(message);
            for (int j = 0; j < sb.length(); j++) {
                int newChar = sb.charAt(j) - count;
                sb.setCharAt(j, (char) newChar);
            }
//            System.out.println(sb.toString());
            Matcher messageMatcher = messagePattern.matcher(sb.toString());
            if (messageMatcher.find()) {
                String planetName = messageMatcher.group("planet");
                String population = messageMatcher.group("population");
                String attackType = messageMatcher.group("attackType");
                String soldierCount = messageMatcher.group("soldierCount");

                if (attackType.equals("A")) {
                    attacked.add(planetName);
                } else {
                    destroyed.add(planetName);
                }

            }
        }
        System.out.printf("Attacked planets: %d%n", attacked.size());
        attacked.stream().sorted(String::compareTo).forEach(p -> System.out.printf("-> %s%n", p));

        System.out.printf("Destroyed planets: %d%n", destroyed.size());
        destroyed.stream().sorted(String::compareTo).forEach(p -> System.out.printf("-> %s%n", p));
    }

}

/*
  int n = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        Pattern countRegex = Pattern.compile("[STARstar]");
        Pattern checkRegex = Pattern.compile("[@](?<planet>[A-Za-z]+)[^@!:>-]*:[\\d]+[^@!:>-]*!([A-Z])![^@!:>-]*->[\\d]+");

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher counter = countRegex.matcher(input);
            int count = 0;

            while (counter.find()) {
                count++;
            }
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                output.append((char) (input.charAt(j) - count));
            }
            Matcher planet = checkRegex.matcher(String.valueOf(output));
            if (planet.find()) {
                if (planet.group(2).equals("A")) {
                    attacked.add(planet.group("planet"));
                } else {
                    destroyed.add(planet.group("planet"));
                }
            }
        }
        System.out.printf("Attacked planets: %d%n", attacked.size());
        if (!attacked.isEmpty()) {
            attacked.stream().sorted().forEach(e -> System.out.printf("-> %s%n", e));
        }
        System.out.printf("Destroyed planets: %d%n", destroyed.size());
        if (!destroyed.isEmpty()) {
            destroyed.stream().sorted().forEach(e -> System.out.printf("-> %s%n", e));
 */
