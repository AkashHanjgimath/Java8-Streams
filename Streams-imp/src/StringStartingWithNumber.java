import java.util.Arrays;
import java.util.List;

public class StringStartingWithNumber {

    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","2banana","grapes","4blueberry","lion","5elephant");

        words.stream().filter(f->!f.isEmpty()&&Character.isDigit(f.charAt(0)))
                .forEach(System.out::println);
    }
}
