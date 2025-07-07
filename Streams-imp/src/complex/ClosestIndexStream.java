package complex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ClosestIndexStream {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(-10,2,4,8,10,12);
        int target=5;

       int closestElement= IntStream.range(0,numbers.size())
                .boxed()
                .min(Comparator.comparingInt(index->Math.abs(numbers.get(index)-target)))
                .orElse(-1);

        System.out.println("Index of the closest element is "+closestElement+" closest value is "+ numbers.get(closestElement));

    }
}
