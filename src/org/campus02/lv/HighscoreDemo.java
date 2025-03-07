package org.campus02.lv;

import java.util.Arrays;

public class HighscoreDemo {

    public static void main(String[] args) {

        Highscore[] highscores = {
                new Highscore("Max", 100.20),
                new Highscore("Susi", 240.50),
                new Highscore("John", 23.90)
        };

        System.out.println(Arrays.toString(highscores));
        Arrays.sort(highscores);
        System.out.println(Arrays.toString(highscores));
    }
}
