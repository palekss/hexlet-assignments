package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> booklist,
                                                      Map<String, String> dictionary) {
        Map<String, String> books = new HashMap<>();
        List<Map<String, String>> result = new ArrayList<>();
        if (booklist.isEmpty()) {
            return result;
        }

        for (var i = 0; i < booklist.size(); i++) {
            books = booklist.get(i);
            var count = 0;
            for (Entry<String, String> dict: dictionary.entrySet()) {
                if (books.containsKey(dict.getKey()) && books.containsValue(dict.getValue())) {
                    count++;
                }
            }
            if (count == dictionary.size()) {
                result.add(books);
            }
        }
        return result;
    }
}
//END
