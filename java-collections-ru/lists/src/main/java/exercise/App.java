package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        if (letters.length() < word.length()) {
            return false;
        }

        letters = letters.toLowerCase();
        word = word.toLowerCase();

        ArrayList<Character> lettersList = new ArrayList<>();
        for (char letter : letters.toCharArray()) {
            lettersList.add(letter);
        }

        int flag = 0;
        for (char letterWord : word.toCharArray()) {
            if (lettersList.contains(letterWord)) {
                flag++;
                lettersList.remove(Character.valueOf(letterWord)); // Удаляем использованную букву из списка
            }
        }

        return flag == word.length();
    }
}
//END
