import java.util.Optional;

public class OptionalClasses {
    public static void main(String[] args) {
        String[] str = new String[10];
        String word = str[5];
        str[5] = "Hi";
        try{
            System.out.println("String Null : " + word);
        } catch (NullPointerException e){
            System.out.println("Null Pointer");
        }

        Optional<String> opt = Optional.ofNullable(str[5]);
        if(opt.isPresent()){
            String words = str[5].toLowerCase();
            System.out.println(words);
        }else{
            System.out.println("Word is null");
        }
    }
}
