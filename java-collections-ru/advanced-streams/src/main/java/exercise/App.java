package exercise;



import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;


// BEGIN
public class App {
    public static String getForwardedVariables(String strEnvironment) {
        String result = "";

        String[] parts = strEnvironment.split("\n");

        result = Arrays.stream(parts)
                .filter(i -> i.startsWith("environment"))
                .map(i -> i.replaceAll("environment=", "").replaceAll("\"", ""))
                .flatMap(i -> Arrays.stream(i.split(",")))
                .filter(line -> line.startsWith("X_FORWARDED_"))
                .map(line -> line.replaceAll("X_FORWARDED_", ""))
                .map(line -> line + ",")
                .collect(Collectors.joining());

        return result.replaceAll(".$", "");
    }
}
//END
