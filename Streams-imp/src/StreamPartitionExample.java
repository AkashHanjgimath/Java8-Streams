import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitionExample {

    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean,List<Integer>> list=num.stream().collect(Collectors.partitioningBy(f->f%2==0));
        System.out.println("List of even: "+list.get(true));
        System.out.println("List of odd: "+list.get(false));
    }


}
