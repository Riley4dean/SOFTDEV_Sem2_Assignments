import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {

        // List<Integer> myList = List.of(1, 2, 3);

        // Integer cumulativeSum = myList.stream().reduce(0, (a, b) -> a + b );
        // System.out.println(cumulativeSum);
        
        // Integer cumulativeProduct = myList.stream().reduce(1, (a, b) -> a * b);

        List<String> classes = List.of("JAPANESE", "PHYSICS", "ALGEBRA", "COMP_SCI", "HISTORY", "LANGAUGE");
        Function<String, String> lowerCase = (s) -> s.toLowerCase();
        List<String> lowerCaseSchedule = classes.stream().map(lowerCase).toList();
        System.out.println(lowerCaseSchedule);

        //create  a list of strings.  
        //fill that list with your daily school schedule
        //write a Function<String, String> toLowerCase
        //the function will equal (s) -> s.toLowerCase();
        //map your list of strings to another list of strings using 
        //.stream().map(toLowerCase).toList(); and set to a variable called lowerCaseSchedule
        //System.out.println(your lower cased list)


    }
}