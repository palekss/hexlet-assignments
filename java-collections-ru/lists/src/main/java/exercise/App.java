package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
//    public static void main(String[] args) {
//        System.out.println("Hello world");
//    }

    public static boolean scrabble(String characterSet, String word) {
        if (characterSet.length() < word.length()) {
            return false;
        }
        String[] chars = characterSet.split("");
        List<String> charList = Arrays.asList(chars);
        List<String> insertedCharList = new ArrayList<>();
        insertedCharList.addAll(charList);
        String[] words = word.split("");
        List<String> wordList = Arrays.asList(words);
        var count = 0;
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = 0; j < insertedCharList.size(); j++) {
                if (wordList.get(i).equalsIgnoreCase(insertedCharList.get(j))) {
                    insertedCharList.remove(j);
                    count++;
                    break;
                }
            }
        }
        return count == wordList.size();
    }
}
//END
