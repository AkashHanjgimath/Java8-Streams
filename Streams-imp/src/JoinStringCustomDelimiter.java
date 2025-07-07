import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringCustomDelimiter {

    public static void main(String[] args) {

        List<String> words= Arrays.asList("apple","banana","Grapes");
//[apple],[banana],[Grapes]
       String result= words.stream().map(word->"["+word+"]").collect(Collectors.joining(","));

        System.out.println(result);
//[apple,banana,Grapes]
        String result2= words.stream().collect(Collectors.joining(",","[","]"));

        System.out.println(result2);

    }
}
