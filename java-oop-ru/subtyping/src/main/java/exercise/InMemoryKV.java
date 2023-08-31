package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> dictionary;

    public InMemoryKV(Map<String, String> startDictionary) {
        this.dictionary = new HashMap<>();
        dictionary.putAll(startDictionary);
    }

    @Override
    public void set(String key, String newValue) {
        dictionary.put(key, newValue);
    }
    @Override
    public void unset(String key) {
        dictionary.remove(key);
    }
    @Override
    public String get(String key, String defaultValue) {
        String result = defaultValue;
        if (dictionary.containsKey(key)) {
            result = dictionary.get(key);
        }
        return result;
    }
    @Override
    public Map<String, String> toMap() {
        Map<String, String> endDictionary = new HashMap<>();
        endDictionary.putAll(dictionary);
        return endDictionary;
    }
}
// END
