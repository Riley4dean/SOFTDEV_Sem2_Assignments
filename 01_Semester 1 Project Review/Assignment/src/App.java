import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(Systen.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        int quotient = 0;
        try{
            quotient = firstNumber / secondNumber;
        } catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        } finally{
            System.out.println(String.format("the answer from division is %s", quotient));
        }
    }
}
