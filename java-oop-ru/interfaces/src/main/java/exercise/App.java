package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
//    public static void main(String[] args) {
//        List<Home> apartments = new ArrayList<>(List.of(
//                new Flat(41, 3, 10),
//                new Cottage(125.5, 2),
//                new Flat(80, 10, 2),
//                new Cottage(150, 3)
//        ));
//
//        List<String> result = buildApartmentsList(apartments, 3);
//        System.out.println(result);
//    }
    public static List<String> buildApartmentsList(List<Home> list, int count) {

        return list.stream()
                .sorted(Home::compareTo)
                .limit(count)
                .map(x -> x.toString())
                .collect(Collectors.toList());

    }
}
// END
