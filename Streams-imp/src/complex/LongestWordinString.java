package complex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestWordinString {

    public static void main(String[] args) {
        String sentence="Java streams make functional programming easy and powerful";

       String firstLongest= Arrays.stream(sentence.split(" "))
                .max(Comparator.comparing(String::length))
                .stream()
               .findFirst()
               .get();

        System.out.println("The First Longest number is "+firstLongest);

    }
}
