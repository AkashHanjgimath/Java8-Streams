import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntersection {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8, 9, 10);
        List<Integer>list=new ArrayList<>(list1);

        list.retainAll(list2);
        System.out.println("Retained :"+list);

        List<Integer>ans=list1.stream().filter(list2::contains).toList();
        System.out.println(ans);
    }
}
