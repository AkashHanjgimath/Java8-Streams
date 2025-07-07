import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JointwoStreams {

    public static void main(String[] args) {

        List<Integer> list1= Arrays.asList(1,2,3);
        List<Integer>list2=Arrays.asList(4,5,6);

        Stream<Integer>combined=Stream.concat(list1.stream(),list2.stream());
        combined.forEach(System.out::println);

    }

}
