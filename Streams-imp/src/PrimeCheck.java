import java.util.Arrays;
import java.util.List;

public class PrimeCheck {


    public static void main(String[] args) {
        List<Integer> numb = Arrays.asList(4, 6, 8, 9, 11, 15, 13);

       numb.stream().filter(PrimeCheck::isPrime)
                .forEach(System.out::println);



    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;

    }

}
