import java.util.Arrays;
import java.util.List;

public class StreamPeekDebug {

    public static void main(String[] args) {

        List<String> words= Arrays.asList("apple","banana","avacoda","blueberry");

        List<String> result= words.stream()
                .peek(f-> System.out.println("Before filter :"+f))
                .filter(f->f.startsWith("a"))
                .peek(f-> System.out.println("After the filter :"+f))
                .map(String::toUpperCase)
                .peek(f-> System.out.println("After the uppercase :"+f))
                .toList();

        System.out.println("Final Result :"+result);


    }


}
