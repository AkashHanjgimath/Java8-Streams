package complex;

import java.util.stream.IntStream;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

       Integer num= IntStream.rangeClosed(1,10).sum();
        System.out.println("Sum of natural numbers are "+num);

    }
}
