import java.util.Arrays;
import java.util.List;

public class divisibleByFive {

    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(20,30,36,70,62);
        numbers.stream().filter(x->x%5==0).forEach(System.out::println);
    }
}
