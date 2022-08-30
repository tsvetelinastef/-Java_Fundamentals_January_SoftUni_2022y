package AssociativeArraysExercise;

import java.util.*;

public class ex8_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, List<String>>  companyUsers = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){

            String[] tokens = input.split(" -> ");
            String companyName = tokens[0];
            String employeeID = tokens[1];

            if (!companyUsers.containsKey(companyName)){
                companyUsers.put(companyName, new ArrayList<>());
                companyUsers.get(companyName).add(employeeID);
            }else{
                if (!companyUsers.get(companyName).contains(employeeID)){
                    companyUsers.get(companyName).add(employeeID);
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyUsers.entrySet()) {
            List<String> temp = entry.getValue();
            System.out.printf("%s%n", entry.getKey());
            for (String s : temp) {
                System.out.printf("-- %s%n", s);

            }
        }

    }
}

/*
Map<String, List<String>> companies = new TreeMap<>();
        String input;

        while (!"End".equals(input = scanner.nextLine())) {
            String[] command = input.split(" -> ");
            companies.putIfAbsent(command[0], new ArrayList<>());

            if (!companies.get(command[0]).contains(command[1])) {
                companies.get(command[0]).add(command[1]);
            }
        }

        companies.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(id -> System.out.printf("-- %s%n", id));
        });
 */


