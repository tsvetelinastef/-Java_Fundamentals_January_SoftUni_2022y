package MID_EXAMS_PREPARE.FirstPartEx;

import java.util.Scanner;

public class ex1_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSum = 0;
        String input = scanner.nextLine();
        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                priceSum += price;
            }
            input = scanner.nextLine();
        }

        double taxes = priceSum * 0.2;
        double totalPrice = priceSum + taxes;
        if (input.equals("special")) {
            totalPrice *= 0.9;
        }

        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.printf("Congratulations you've just bought a new" +
              " computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n" +
               "-----------%nTotal price: %.2f$", priceSum, taxes,
                    totalPrice);
        }

    }
}

/* double prices = Double.parseDouble(scanner.nextLine());
        List<Double> computerElements = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toList());

        String command;  //= scanner.nextLine();
        while (!"special".equals(command = scanner.nextLine()) ||
         !"regular".equals(command = scanner.nextLine())) {
            double price = Double.parseDouble(command);
            for (int i = 0; i < computerElements.size(); i++) {
               // computerElements.set(i, computerElements.get(i) - price);
               // computerElements.set(i,computerElements.get(i) + price);
         double priceWithoutTaxes = computerElements.get(i) + price;
         System.out.println("Congratulations you've just bought a new
                    computer!");
         System.out.printf("Price without taxes: %.2f$%n",
                priceWithoutTaxes);
         double taxes = priceWithoutTaxes * 0.20;
                System.out.printf("Taxes: %.2f$%n", taxes);
         double finalPrice = priceWithoutTaxes + taxes;
         double priceWithAddDiscount = finalPrice - (finalPrice * 0.10);
         System.out.printf("Total price: %.2f$%n", priceWithAddDiscount);

                if (price < 0){
                    System.out.println("Invalid price!");
                }


            }
        } //if ("regular".equals(command = scanner.nextLine())){
          //  System.out.println("Invalid order!");
          //  }

        System.out.println(computerElements.toString().
                replaceAll("[\\[\\],]", "")
                .replaceAll(", ", " "));
       // System.out.println("Congratulations you've just bought a new
       computer!");

  */