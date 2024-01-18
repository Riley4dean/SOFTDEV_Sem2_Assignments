public class App {
    public static void main(String[] args) throws Exception {

        Property<Integer> myInteger = new Property<Integer>();
        myInteger.set(5);
        System.out.println(myInteger.get()); 
        myInteger.set(10);
        System.out.println(myInteger.get());
        myInteger.set(100);
        System.out.println(myInteger.get());

    }
}