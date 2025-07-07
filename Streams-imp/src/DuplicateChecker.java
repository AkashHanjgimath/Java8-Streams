import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,6};

        Set<Integer>numSet=new HashSet<>();

       boolean response= Arrays.stream(arr).anyMatch(f-> !numSet.add(f));

       boolean res=Arrays.stream(arr).distinct().count()!= arr.length;

        System.out.println("Arrays contains the duplicate :"+response);
        System.out.println("Arrays contains the duplicate :"+res);


    }
}
