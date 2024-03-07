import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Double> future = CompletableFuture.supplyAsync(
            ()-> Math.random()
        );

        CompletableFuture<Void> futureRandom = future.thenAccept(s->{
            System.out.println(s * 2);
        });

        futureRandom.get();
    }
}
