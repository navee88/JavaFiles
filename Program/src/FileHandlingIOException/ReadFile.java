package FileHandlingIOException;

import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("example1.pdf");
            int ch;
            while((ch = reader.read()) >= 0){
                System.out.print((char) ch);
            }
            reader.close();
        }
        catch (Throwable err){
            System.out.println(err);
        }
    }
}