package FileHandlingIOException;

import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryWriteExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("example1.pdf")) {
            String data = "This is not a real PDF, just binary data";
            fos.write(data.getBytes());
            System.out.println("File written as binary!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
