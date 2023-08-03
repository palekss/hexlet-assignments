package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//    }

    public static long getCountOfFreeEmails(List<String> listEmails) {
        List<String> freeEmails = new ArrayList<>(Arrays.asList("@gmail.com", "@yandex.ru", "@hotmail.com"));
        long result1 = listEmails.stream()
                .filter(email -> email.endsWith(freeEmails.get(0)))
                .count();
//
        long result2 = listEmails.stream()
                .filter(email -> email.endsWith(freeEmails.get(1)))
                .count();

        long result3 = listEmails.stream()
                .filter(email -> email.endsWith(freeEmails.get(2)))
                .count();
        return result1 + result2 + result3;
    }

}
// END
