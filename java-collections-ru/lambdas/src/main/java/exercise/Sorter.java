package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
//import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> list) {
        if (list != null) {
            return list.stream()
                    .filter(user -> user.get("gender").equals("male"))
                    .sorted(Comparator.comparing(user -> user.get("birthday")))
                    .map(user -> user.get("name"))
                    .collect(Collectors.toList());
//                .sorted(birthday1, birthday2)
//        return result;
        } else {
            return new ArrayList<>();
        }
    }
}
// END
