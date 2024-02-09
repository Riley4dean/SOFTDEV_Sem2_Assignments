import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {   
        Function<Integer, Integer> subtract5 = (num) -> num - 5;
        Function<Integer, Integer> Times5 = (num) -> num * 5;
        Function<Integer, Integer> subtract5Times5 = subtract5.andThen(Times5);
        int testNumber = 1;
        var answer = subtract5Times5.apply(testNumber);
        System.out.println(answer);

    }

}
