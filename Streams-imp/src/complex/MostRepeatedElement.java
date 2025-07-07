package complex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,2,3,3,6,3};

        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .ifPresent(x-> System.out.println("Most Repeated value is : "+x ));
    }
}
