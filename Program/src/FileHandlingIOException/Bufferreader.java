package FileHandlingIOException;

import java.io.FileReader;
import java.io.BufferedReader;

public class Bufferreader {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("Example.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (Throwable tr){
            tr.printStackTrace();
        }
    }
}
