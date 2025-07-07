import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {

    private final String date;
    private final double sum;


    public Transaction(String date, double sum) {
        this.date = date;
        this.sum = sum;
    }

    public String getDate() {
        return date;
    }

    public double getSum() {
        return sum;
    }
}

public class TransactionSum {
    public static void main(String[] args) {

        List<Transaction> list = Arrays.asList(
                new Transaction("2025-06-01", 100.0),
                new Transaction("2025-06-02", 150.5),
                new Transaction("2025-06-01", 200.75),
                new Transaction("2025-06-03", 200.75),
                new Transaction("2025-06-02", 100.75)
                );

      Map<String,Double>map=  list.stream()
                .collect(Collectors.groupingBy(Transaction::getDate,Collectors.summingDouble(Transaction::getSum)));

      //Alternative
        Map<String, Double> map2 = list.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getDate,
                        Collectors.reducing(0.0, Transaction::getSum, Double::sum)
                ));

        map.forEach((x,y)-> System.out.println("Date is "+x+ " and sum is "+y));
    }
}