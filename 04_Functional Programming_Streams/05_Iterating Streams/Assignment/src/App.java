import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        //This assignment is partially guided please wait. 
         List<Integer> ints = IntStream.rangeClosed(0, 10).boxed().toList();
         Function<Integer, Integer> add5Func = (number) -> number + 5;
         List<Integer> intsPlus5 = ints.stream().map(add5Func).toList();
         Function<Integer, Integer> div2Func = (number) -> number / 2;
         List<Integer> intsDiv2 = ints.stream().map(div2Func).toList();
         Function<Integer, Integer> add5div2Func = (number) -> number / 2 + 5;
         List<Integer> intsPlus5Div2 = ints.stream().map(add5div2Func).toList();
         Consumer<Integer> intPrinter = (number) ->System.out.println(number);
        intsPlus5.stream().forEach(intPrinter);
        intsDiv2.stream().forEach(intPrinter);
        intsPlus5Div2.stream().forEach(intPrinter); 
    }
}