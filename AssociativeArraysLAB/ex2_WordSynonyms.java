package AssociativeArraysLAB;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex2_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();


            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

       // Map<String, List<String>> wordSynonym = new LinkedHashMap<>();

        words.forEach((key, value) -> System.out.println(key + " - " + String.join(", ", value)));

    }
}
