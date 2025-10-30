package FileHandlingIOException;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File file = new File("example1.pdf");
            if(file.createNewFile()){
                System.out.println("File is created: " + file.getName());

            }else{
                System.out.println("File is Already is their");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
