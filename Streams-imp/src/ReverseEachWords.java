import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWords {

    public static void main(String[] args) {
        String str="Java 8 are awesome";
        String reversedString= Arrays.asList(str.split(" "))
               .stream().map(x->new StringBuilder(x).reverse())
               .collect(Collectors.joining(" "));

        System.out.println(reversedString);

    }

}
