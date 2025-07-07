import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<String>list= Arrays.asList("apple","banana","apple","orange","banana");
        list.stream().distinct().forEach(System.out::println);
        list.stream().collect(Collectors.toSet()).forEach(System.out::println);
        new HashSet<>(list).forEach(System.out::println);

    }

}
