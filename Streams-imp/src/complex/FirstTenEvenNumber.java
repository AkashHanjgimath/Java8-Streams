package complex;

import java.util.stream.IntStream;

public class FirstTenEvenNumber {

    public static void main(String[] args) {

        IntStream.rangeClosed(2, 20).filter(num -> num % 2 == 0).limit(10).forEach(System.out::println);

    }

}
