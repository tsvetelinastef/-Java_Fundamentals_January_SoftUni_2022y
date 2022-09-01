package ObjectAndClasses_Exercise;

import java.util.*;

public class ex4_Articles2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> dataList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (
                int i = 0;
                i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            Article data = new Article(input[0], input[1], input[2]);
            dataList.add(data);
        }

        String input = scanner.nextLine();

        switch (input) {
            case "title":
                dataList.stream().//sorted(Comparator.comparing(Article::getTitle))
                        forEach(data -> System.out.println(data.output()));
                break;
            case "content":
                dataList.stream().//sorted(Comparator.comparing(Article::getContent))
                        forEach(data -> System.out.println(data.output()));
                break;
            case "author":
                dataList.stream().//sorted(Comparator.comparing(Article::getAuthor))
                        forEach(data -> System.out.println(data.output()));
                break;
        }
    }

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String output() {
            return String.format("%s - %s: %s", getTitle(),
                    getContent(), getAuthor());
        }


    }
}



/*


======================================================================================

  String title;
        String content;
        String author;

    public ex4_Articles2(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",this.title,this.content,this.author);
        }
    }

    public class Articles2_0 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            List<ex4_Articles2> articleList = new ArrayList<>();
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {

                String[] articleToken = scanner.nextLine().split(", ");
                String title = articleToken[0];
                String content = articleToken[1];
                String author = articleToken[2];
                ex4_Articles2 article = new ex4_Articles2(title, content, author);
                if (!articleList.contains(article)) {
                    articleList.add(article);
                }
            }
            String filter = scanner.nextLine();
            switch (filter) {
                case "title":
                    Collections.sort(articleList, new Comparator<ex4_Articles2>() {
                        @Override
                        public int compare(ex4_Articles2 o1, ex4_Articles2 o2) {
                            return o1.title.compareTo(o2.title);
                        }
                    });
                    break;
                case "content":
                    Collections.sort(articleList, new Comparator<ex4_Articles2>() {
                        @Override
                        public int compare(ex4_Articles2 o1, ex4_Articles2 o2) {
                            return o1.content.compareTo(o2.content);
                        }
                    });
                    break;
                case "author":
                    Collections.sort(articleList, new Comparator<ex4_Articles2>() {
                        @Override
                        public int compare(ex4_Articles2 o1, ex4_Articles2 o2) {
                            return o1.author.compareTo(o2.author);
                        }
                    });
                    break;
            }
            for (ex4_Articles2 article : articleList) {
                System.out.println(article);
            }


 */





