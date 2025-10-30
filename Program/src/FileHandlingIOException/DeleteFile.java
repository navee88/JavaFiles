package FileHandlingIOException;

import java.nio.file.*;

public class DeleteFile {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("example.txt");
            Files.delete(path); // deletes the file
            System.out.println("File is Deleted...");
        } catch (Throwable e) {
//            System.out.println("File is not Deleted...");
            e.printStackTrace();
        }
    }
}
