import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedMultipleFields {
    public static void main(String[] args) {

        List<Employee> emp= Arrays.asList(new Employee("Alic", 30),
                new Employee("BOB", 35),
                new Employee("Charles", 40),
                new Employee("Michel", 20),
                new Employee("David", 30));

        emp.stream()
                .sorted(Comparator.comparingInt(Employee::getAge)
                        .thenComparing(Employee::getName))
                .forEach(System.out::println);

    }
}
