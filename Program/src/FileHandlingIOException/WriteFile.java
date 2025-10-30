package FileHandlingIOException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
       try{
           FileWriter writer= new FileWriter("example.txt");
           writer.write("Hello World of the System");
           writer.close();
           System.out.println("Written Done");
       }
       catch (Throwable err){
           System.out.println(err.fillInStackTrace().getMessage());
       }
    }
}
