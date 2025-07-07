import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private final String name;
    private final int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class AverageAgecalculator {
    public static void main(String[] args) {

        List<Student> studentList= Arrays.asList(
                new Student("Alice",30),
                new Student("Bob",28),
                new Student("John",32),
                new Student("Kinnedy",27));

       double result=studentList
                       .stream()
                       .mapToInt(student-> student.getAge()).average().orElse(0.0);

      double average= studentList.stream().collect(Collectors.averagingInt(f-> f.getAge()));

      System.out.println(result);
        System.out.println("Second type "+average);

    }

}
