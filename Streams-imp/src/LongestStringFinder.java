import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringFinder {

    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","kiwi","pineapple","grapes","banana");

        Optional<String> longest=words.stream().max(Comparator.comparingInt(String::length));
        longest.ifPresent(System.out::println);
    }
}
