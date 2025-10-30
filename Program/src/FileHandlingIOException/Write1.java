package FileHandlingIOException;

import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Write1 {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("example1.pdf");
            writer.write("Hi writing the File content");
            writer.close();
            System.out.println("Writing is done");
        }catch (Throwable tr){
            tr.printStackTrace();
        }
    }
}
