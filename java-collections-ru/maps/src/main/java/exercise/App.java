package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static Map getWordCount(String sentence) {
        Map<String, Integer> wordsMap = new HashMap<>();
        if (sentence.length() == 0) {
            return wordsMap;
        }
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            var count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            wordsMap.put(words[i], count);
        }
        return wordsMap;
    }

    public static String toString(Map<String, Integer> wordsMap) {
        String result = "{\n";
        if (wordsMap.isEmpty()) {
            return "{}";
        }
        for (Map.Entry<String, Integer> word : wordsMap.entrySet()) {
            result = result + "  " + word.getKey() + ": " + word.getValue() + "\n";
        }
        result = result + "}";
        return result;
    }
}
//END
