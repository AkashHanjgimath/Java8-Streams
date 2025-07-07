package complex;

import java.util.stream.Stream;

public class FibonacciStream {

    public static void main(String[] args) {
        int n = 10;

        Stream.iterate(new int[]{0, 1}, num -> new int[]{num[1], num[0] + num[1]})
                .peek(num -> System.out.println("Intermediate pair: " + num[0] + ", " + num[1]))
                .limit(n)
                .map(num -> num[0])
                .forEach(fib -> System.out.println("Fibonacci number: " + fib));
    }
}
