package FileHandlingIOException;


import java.nio.file.*;
import java.util.Collections;

public class Read1 {
    public static void main(String[] args) {
        try{
            Path file = Paths.get("example.txt");
            Files.write(file, Collections.emptyList());
            System.out.println("File content is cleared successfully");
        }
        catch (Throwable tr){
            tr.printStackTrace();
        }
    }
}
