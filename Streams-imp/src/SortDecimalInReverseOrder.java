import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDecimalInReverseOrder {

    public static void main(String[] args) {
        List<Double>list= Arrays.asList(3.14,1.33,2.64,5.44);

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
