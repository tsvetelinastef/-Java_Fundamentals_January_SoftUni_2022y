package ObjectAndClasses_Exercise;

import java.util.Random;
import java.util.Scanner;

public class ex1_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Message message = new Message();
       // след като напишем private String[] phrases в  static class Message{ ...
        // пишем тук message. и виждаме , че всъщност пак можем да достъпим phrases
        message.printMessages(n);
    }

    static class Message{
        //Ако е private  String[] phrases = {"Excellent .....};
        // в main пак може да бъде достъпено , защото е в един и същи
        // public class ex1_AdvertisementMessage {
         String[] phrases = {"Excellent product.",
                "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.",
                "I can’t live without this product."};
        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. ", "I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!" };
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random random = new Random();


        void printMessages(int messages){
           // random.nextInt(this.phrases.length);

            for (int i = 0; i < messages; i++) {
                System.out.printf("%s %s %s - %s%n",
                        this.phrases[random.nextInt(this.phrases.length)],
                        this.events[random.nextInt(this.events.length)],
                        this.authors[random.nextInt(this.authors.length)],
                        this.cities[random.nextInt(this.cities.length)]);
                // 0 --> защото e random елемент/число


               // this.phrases[random.nextInt(this.phrases.length)];
            }


        }
    }




}
