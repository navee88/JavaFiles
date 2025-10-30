package FileHandlingIOException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Create1 {
    public static void main(String[] args) {
       try{
           Path file = Paths.get("Example.txt");
           if(file.toFile().createNewFile()){
               System.out.println("File is Created");
           }else{
               System.out.println("File Creating Error");
           }
       }
       catch (Throwable e){
           e.printStackTrace();
       }
    }
}
