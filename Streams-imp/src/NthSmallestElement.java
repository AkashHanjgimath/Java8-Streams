import java.util.Arrays;
import java.util.Comparator;

public class NthSmallestElement {


    public static void main(String[] args) {

        int[] arr={12,3,14,6,15,1,2};
        int n=3;

        Arrays.stream(arr)
                .sorted()
                .skip(n-1)
                .findFirst()
                .ifPresent(System.out::println);

//Finding largest number

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(n-1)
                .findFirst()
                .ifPresent(System.out::println);

    }


}
