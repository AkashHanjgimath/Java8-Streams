import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatisticsExample {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5);

        IntSummaryStatistics stats=num.stream().mapToInt(Integer::intValue).summaryStatistics();

        System.out.println("Maximum :"+stats.getMax());
        System.out.println("Minimum :"+stats.getMin());
        System.out.println("Average :"+stats.getAverage());
        System.out.println("Sum :"+stats.getSum());
        System.out.println("Count :"+stats.getCount());
    }

}
