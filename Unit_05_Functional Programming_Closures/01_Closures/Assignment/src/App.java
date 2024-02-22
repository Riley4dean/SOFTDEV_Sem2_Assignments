import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) throws Exception {
        Double startValue = 1500.0;
        Function<Double, Double> addStartValueToInteger = (integer) -> {
            return integer + startValue;
        };
        String word;
        Function<String, String>  randomWord = (string)->{
            return string;
        };

        StringProperty startProperty = StringProperty.of("Hi");
        Function<StringProperty, StringProperty>addToStartProperty = (string) ->{
            startProperty.set(startProperty.get());
            return startProperty;
        };
        DoubleProperty startProperty2 = DoubleProperty.of(1500.0);
        Function<DoubleProperty,DoubleProperty> addToStartProperty2 = (integer) ->{
            startProperty2.plus(integer);
            return startProperty2;
        };
        startProperty2.plus(DoubleProperty.of(5.0)).plus(DoubleProperty.of(5.0));
        System.out.println(startProperty);
        

    }

    }

