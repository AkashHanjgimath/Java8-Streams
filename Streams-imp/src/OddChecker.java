import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class OddChecker {

    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,4};

       OptionalInt sol= Arrays.stream(arr).filter(f->f%2!=0).findFirst();
       sol.ifPresent(System.out::println);

    }
}
