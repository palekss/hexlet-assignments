package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
//    static KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));
//
//    public static void main(String[] args) {
//        storage.get("key", "default"); // "10"
//        System.out.println(storage.get("key", "default"));
//        storage.get("unknown", "default"); // "default"
//        System.out.println(storage.get("unknown", "default"));
//        // Установка нового значения
//        storage.set("key2", "value2");
//        System.out.println(storage.toMap());
//        System.out.println(storage.get("key2", "default")); // "value2"
//        // Удаление ключа
//        storage.unset("key2");
//        System.out.println(storage.toMap());
//        System.out.println(storage.get("key2", "default")); // "default"
//        // Получение всех данных из базы
//        Map<String, String> data = storage.toMap();
//        data.put("qwe", "rty");
//        System.out.println(storage.toMap());
//        System.out.println(data); // => {key=10};
//        storage.set("key2", "value2");
//        swapKeyValue(storage);
//        System.out.println(storage.toMap());
//    }




    public static void swapKeyValue (KeyValueStorage storage) {
        for (Map.Entry<String, String> item : storage.toMap().entrySet()) {
            storage.unset(item.getKey());
            storage.set(item.getValue(), item.getKey());
        }
    }
}
// END
