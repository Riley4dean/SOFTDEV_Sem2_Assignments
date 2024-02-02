import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "src/starter.txt";
        String transferFile = "src/ender.txt";

        Path filePath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(filePath);
        FileWriter fileWriter = new FileWriter(transferFile, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);


        for (String transfer : lines){
            writer.append(transfer);
            writer.append("\n");
        }
        
        writer.close();
    }

}

