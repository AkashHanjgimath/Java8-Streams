import java.util.Arrays;
import java.util.List;

public class SumOfUniqueNumbers {

    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(1,2,2,3,4,4,5,6,7,7,9,0);

       int result= num.stream().distinct().mapToInt(Integer::intValue).sum();
        System.out.println(result);

    }

}
