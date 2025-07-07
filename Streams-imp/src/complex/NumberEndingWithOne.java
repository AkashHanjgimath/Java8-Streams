package complex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NumberEndingWithOne {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(105,21,31,22,20,71,61,41,71,50,212,132,11);

        numbers.stream()
                .filter(x->x%10==1)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("number containing anywhere 1 and print in descending order");

        numbers.stream().filter(f->String.valueOf(f).contains("1"))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("number containing 1 in first and print in descending order");

        numbers.stream().filter(f->String.valueOf(f).startsWith("1"))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
