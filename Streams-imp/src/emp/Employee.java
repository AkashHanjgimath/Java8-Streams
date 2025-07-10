package emp;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    private int yearOfJoining;

    public Employee(int id, String name, int age, long salary, String gender,
                    String deptName, String city, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", deptName='" + deptName + '\'' +
                ", city='" + city + '\'' +
                ", yearOfJoining='" + yearOfJoining + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));


        // 1.Group the Employees by city.

        empList.stream()
                .collect(Collectors.groupingBy(Employee::getCity))
                .entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue().stream().map(x -> x.getId() + " - " + x.getName()).toList()));


        // 2.Find the count of male and female employees present in the organization.

        Map<String, Long> gender = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("Count of male and female employees present in the organization:: \n" + gender);


        //3.Print the names of all departments in the organization.
        System.out.println("Names of the department are : ");
        empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

        //4.Print employee details whose age is greater than 28.
        System.out.println("List of emps whose age is greater than 28 are ");
        empList.stream().filter(x -> x.getAge() > 28).forEach(System.out::println);

        //5.Find maximum age of employee.
        OptionalInt max = empList.stream().mapToInt(Employee::getAge).max();
        //max.ifPresent(System.out::println);
        if (max.isPresent()) {
            System.out.println("Maximun age is : " + max.getAsInt());
        }

        // 6.Print Average age of Male and Female Employees.

        empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
                .forEach((x, y) -> {
                    System.out.println("Average age of the " + x + " Employees : " + y);
                });

        // 7.Print the number of employees in each department

        empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .forEach((x, y) -> {
                    System.out.println("No of emps in " + x + " department are : " + y);
                });


        // 8.Find oldest employee
        OptionalInt age = empList.stream()
                .mapToInt(Employee::getAge).max(); //This approach is used to find the max age

        Optional<Employee> agge = empList.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println("Oldest Employee is : \n" + agge.get());

        // 9.Find youngest female employee

        Optional<Employee> female = empList.stream().filter(x -> x.getGender() == "F")
                .min(Comparator.comparingInt(Employee::getAge));

        System.out.println("Youngest female is :\n" + female.get());

        // 10. Find employees whose age is greater than 30 and less than 30
        System.out.println("Employees whose age is greater than 25 and less than 25");
        Map<Boolean, List<Employee>> partionEmployeeAge = empList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30));

        Set<Map.Entry<Boolean, List<Employee>>> empSet = partionEmployeeAge.entrySet();

        for (Map.Entry<Boolean, List<Employee>> entry : empSet) {
            if (Boolean.TRUE.equals(entry.getKey())) {
                System.out.println("Employees age greater than 30 are ::\n" + entry.getValue());
            } else {
                System.out.println("Employees age less than 30 are ::\n" + entry.getValue());
            }
        }

        //11.Find the department name which has the highest number of employees

        Map.Entry<String, Long> maxNoOfEmp = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();
        System.out.println("Max no of emp present in Dept :: " + maxNoOfEmp);

        //12. Find if there any employees from HR Department

        Optional<Employee> emp = empList.stream()
                .filter(x -> x.getDeptName().equalsIgnoreCase("HR"))
                .findAny();

        emp.ifPresent(employee -> System.out.println("Found employees from HR department " + employee));

        //13. Find the department names that these employees work for, where the number of employees in the department is over 3
        System.out.println("Department names where no. employees are more than 3");
        empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet()
                .stream()
                .filter((x) -> x.getValue() > 3)
                .forEach(System.out::println);

        // 14.Find distinct department names that employees work for
        System.out.println("Distinct department names that employees work for::");
        empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

        // 15.Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of employees
        empList.stream().filter(x -> x.getCity().equalsIgnoreCase("Blore"))
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(f -> {
                    System.out.println("Emps lives in B'lore are : " + f.getName());
                });

        //16. No of employees in the organisation
        long empCount = empList.stream().count();
        System.out.println("No. of Emps are : " + empCount);

        //17.Find employee count in every department

        empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .forEach((x, y) -> System.out.println("No of Emps in " + x + " are " + y));

        //18.Find the department which has the highest number of employees

        Optional<Map.Entry<String, Long>> highestemps = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        highestemps
                .ifPresent(entry -> System.out.println(entry.getKey() + " Department having with most empls : " + entry.getValue()));

        //19. Sorting a Stream by age and name fields.
        System.out.println("Sorting based on Name and age");
        empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)).forEach(System.out::println);

        //20.Highest experienced employees in the organization
        Optional<Employee> highestExp = empList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).stream().findFirst();
        System.out.println("Highest Experienced Employee is : " + highestExp.get());

        Optional<Employee> senior = empList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
        System.out.println("Senior Empl is " + senior);


        // 21.Print average and total salary of the organization
        LongSummaryStatistics empSalary= empList.stream().collect(Collectors.summarizingLong(Employee::getSalary));

        System.out.println("Average salary of an employee "+empSalary.getAverage());
        System.out.println("Total salary of an employee "+empSalary.getSum());



    }
}