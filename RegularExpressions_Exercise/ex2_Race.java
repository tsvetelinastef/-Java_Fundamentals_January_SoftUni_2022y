package RegularExpressions_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ex2_Race {
    //public static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameRegex = "[A-Za-z]+";
        String distanceRegex = "[\\d]{1}";
        List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> racers = new LinkedHashMap<>();
        for (String name : names) {
            racers.putIfAbsent(name, 0);
        }
        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern distancePattern = Pattern.compile(distanceRegex);

        String line = scanner.nextLine();
        while (!line.equals("end of race")) {
            Matcher nameMatcher = namePattern.matcher(line);
            StringBuilder sb = new StringBuilder();
            while (nameMatcher.find()) {
                sb.append(nameMatcher.group());
            }
            if (racers.containsKey(sb.toString())) {
                Matcher distanceMatcher = distancePattern.matcher(line);

                while (distanceMatcher.find()) {
                    int digit = Integer.parseInt(distanceMatcher.group());
                    racers.put(sb.toString(), racers.get(sb.toString()) + digit);
                }
            }


            line = scanner.nextLine();
        }
        List<String> sorted = racers.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .map(Map.Entry::getKey).collect(Collectors.toList());
        String text = "";
        for (int i = 0; i < sorted.size(); i++) {
            if (i == 3) {
                break;
            }
            text = i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "";
//            if (i == 0) {
//                text = "st";
//            } else if (i == 1) {
//                text = "nd";
//            } else if (i == 2) {
//                text = "rd";
//            }
            System.out.printf("%d%s place: %s%n", i + 1, text, sorted.get(i));


        }
    }
}


/*
  Map<String, Integer> raceInfo = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toMap(s -> s, s -> 0, (a, b) -> a, LinkedHashMap::new));
        String input;

        while (!"end of race".equals(input = scanner.nextLine())) {
            int sum = 0;
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    sum += Integer.parseInt(String.valueOf(input.charAt(i)));
                } else if (Character.isUpperCase(input.charAt(i))) {
                    name.append(input.charAt(i));
                } else if (Character.isLowerCase(input.charAt(i)) && name.length() > 0) {
                    name.append(input.charAt(i));
                }
            }
            if (raceInfo.containsKey(String.valueOf(name))) {
                raceInfo.put(String.valueOf(name), raceInfo.get(String.valueOf(name)) + sum);
            }
        }
        String[] num = new String[]{"1st", "2nd", "3rd"};
        raceInfo.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3)
                .forEach(entry -> {
                    System.out.printf("%s place: %s%n", num[index], entry.getKey());
                    index++;
                });
 */