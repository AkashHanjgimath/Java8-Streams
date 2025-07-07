import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private final String name;
    private final Integer age;

    Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }



    @Override
    public String toString() {
        return name+" ("+age+")";
    }


}

public class GroupByExample {

    public static void main(String[] args) {
        List<Employee> emp=Arrays.asList(new Employee("Alic", 30),
                new Employee("BOB", 30),
                new Employee("Charles", 40),
                new Employee("Michel", 20),
                new Employee("David", 30));

        Map<Integer,List<Employee>> result=emp.stream().collect(Collectors.groupingBy(Employee::getAge));
        result.forEach((x,y)-> System.out.println("The age "+x+" the emps are "+y));


    }

}
