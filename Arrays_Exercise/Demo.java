package Arrays_Exercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfCustomer = scanner.nextLine();

        // MID EXAM


    /*    if ((!"special".equals(typeOfCustomer)) && (!"regular".equals(typeOfCustomer))){
            int partsPrice = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < partsPrice; i++) {

            }
        } else {
            System.out.printf("Total price: %.2f", );
        }
     */



        // Напишете програма, която ви отпечатва разписка за вашия нов компютър.
        // Ще получите цените на частите (без данък)
        //докато не получите какъв тип клиент е това - специален или редовен.
        // След като получите вида на клиента ви
        //трябва да отпечата разписката.
        //Данъците са 20% от цената на всяка част, която получавате.
        //Ако клиентът е специален, той има 10% отстъпка от общата цена с данъци.

        //Ако дадена цена не е положително число, трябва да отпечатате
        // "Невалидна цена!" на конзолата и продължете с
        //следващата цена.
        //Ако общата цена е равна на нула, трябва да отпечатате
        // "Невалидна поръчка!" на конзолата.
        double partPrice = Double.parseDouble(scanner.nextLine());
        double taxes = 0.0;



        double sum = 0.0;
        for (int i = 0; i < partPrice; i++) {
             sum += partPrice;
        }

        taxes = partPrice - (partPrice * 0.20);
        double totalPrice = partPrice + taxes;


        if ("special".equals(typeOfCustomer)){
            double discount = totalPrice - (totalPrice * 0.10);
            System.out.printf("Total price: %.2f", discount);
        }



    }
}

/*
 //  int peopleWaiting = Integer.parseInt(scanner.nextLine());
        //int[] currentSateOfTheLift = Arrays.stream(Integer.parseInt().split(" ")).toArray();
        // int[] wagon = Console.ReadLine().Split().Select(int.Parse).ToArray();
       // int[] currentSateOfTheLift = Arrays.stream(scanner.nextLine().split(" "))
             //   .mapToInt(Integer::parseInt).toArray();
 */