import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","pineapple","mango","apple","mango","orange");

        Map<String,Long> wordTocount=words.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        wordTocount.forEach((x,y)-> System.out.println(x+" : "+y));

    }
}
