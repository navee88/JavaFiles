package FileHandlingIOException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferwriter {
    public static void main(String[] args) {
       try(BufferedWriter  bw = new BufferedWriter(new FileWriter("Example.txt", true))){
                bw.write("Hi Hello World these is first line");
                bw.newLine();
                bw.write("Hi these is second line");
           System.out.println("File Write Succefully");
       }
       catch (Throwable tr){
           tr.printStackTrace();
       }
    }
}
