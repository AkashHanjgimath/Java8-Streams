import java.util.Arrays;
import java.util.List;

public class NumbersStartingWithOne {

    // find the numbers starting with one
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(10, 21, 33, 100, 14, 1, 15, 43, 5);

        List<Integer> filteredNum = number.stream()
                .filter(num -> String.valueOf(num)
                        .startsWith("1"))
                .toList();
        filteredNum.forEach(System.out::println);



//Number not starting with zero

        List<Integer> filteredNum2 = number.stream()
                .filter(num -> !String.valueOf(num)
                        .startsWith("1"))
                .toList();
        filteredNum2.forEach(System.out::println);

    }
}
