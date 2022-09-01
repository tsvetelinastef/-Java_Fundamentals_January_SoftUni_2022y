package ObjectAndClasses_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex4_Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split("_");
            Song currentSong = new Song();
            currentSong.setTypeList(input[0]);
            currentSong.setName(input[1]);
            currentSong.setTime(input[0]); // 2
            songs.add(currentSong);
        }
        String input = scanner.nextLine();
        if (input.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(input)) {
                    System.out.println(song.getName());

                }
            }
        }
    }

    static class Song {
        private String typeList;

        private String getTypeList() {
            return typeList;
        }

        private void setTypeList(String typeList) {
            this.typeList = typeList;
        }


        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        String time;

        public void setTime(String time) {
            this.time = time;
        }
    }

}

