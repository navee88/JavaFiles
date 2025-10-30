package FileHandlingIOException;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Fileinputstr {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("image.png");
            FileOutputStream fos = new FileOutputStream("copy.png")
        ){
            int i;
            while ((i = fis.read()) != -1) {
                 fos.write(i);

            }

            System.out.println("File copied successfully.");


        }catch (Throwable tr){
            tr.printStackTrace();
        }
    }
}
