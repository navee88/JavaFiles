package FileHandlingIOException;

import java.io.*;
import java.util.*;

public class Bufferlinedelete {
    public static void main(String[] args) {
        String removing = "added";
        List<String> lst = new ArrayList<>();

        try(BufferedReader bfr = new BufferedReader(new FileReader("Example.txt"))){
            String line;
            while((line = bfr.readLine()) != null){
                if(line.equals(removing)){
                    lst.add(line);
                }
            }
        }
        catch (Throwable tr){
            tr.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Example.txt"))){
            for(String l : lst){
                bw.write(l);
                bw.newLine();
            }
            System.out.println("Line Removed Suceffully");
        }
        catch (Throwable tr){
            tr.printStackTrace();
        }
    }
}
