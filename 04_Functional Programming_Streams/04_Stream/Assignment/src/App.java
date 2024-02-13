import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> classes = List.of("JAPANESE", "PHYSICS", "ALGEBRA", "COMP_SCI", "HISTORY", "LANGAUGE");
        Function<String, String> lowerCase = (s) -> s.toLowerCase();
        List<String> lowerCaseSchedule = classes.stream().map(lowerCase).toList();
        System.out.println(lowerCaseSchedule);
    }
}