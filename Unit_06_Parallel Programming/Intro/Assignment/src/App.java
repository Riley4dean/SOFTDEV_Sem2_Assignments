public class App {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i <= 10000; i++){
            SqrtRunnable sqrt = new SqrtRunnable(i);
            sqrt.start();
        }
    }
}
