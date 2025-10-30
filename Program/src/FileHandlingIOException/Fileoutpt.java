package FileHandlingIOException;

import java.io.FileOutputStream;

public class Fileoutpt {
    public static void main(String[] args) {
        String text = "\n new text is added here2";

        try(FileOutputStream fos = new FileOutputStream("Example.txt", true)){
            fos.write(text.getBytes());
            System.out.println("File is appended");
        }catch (Throwable tr){
            System.out.println("File creating is error");
            tr.printStackTrace();
        }
    }
}
