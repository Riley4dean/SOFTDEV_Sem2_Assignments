import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "src/Assignment.txt";

        Path filePath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(filePath);
        for (String i : lines){
            System.out.println(i); 
        }
        
    }

}

