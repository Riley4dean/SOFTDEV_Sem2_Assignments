public class App {
    public static void main(String[] args) throws Exception {
        Property<Double> number1 = new Property<Double>(3.0);
        Property<Double> number2 = new Property<Double>(5.0);
        // Property<DummyClass> myDummyPropert = new Property<>();
        System.out.println("number1 > number2" + number1.isGreaterthan(number2));
        System.out.println("number1 < number2" + number1.isLessthan(number2));
        System.out.println("number1 <= number2" + number1.isLessThanOrEqual(number2));
        System.out.println("number1 >= number2" + number1.isGreaterThanOrEqual(number2));
        System.out.println("number1 not equals number2" + number1.equals(number2));
        System.out.println("number1 = number2" + number1.equals(number2));
        

    }
}