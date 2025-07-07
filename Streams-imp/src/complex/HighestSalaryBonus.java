package complex;

import java.util.List;

class Employee
{
    private String empName;
    private Integer empSal;


    public Employee(String empName, Integer empSal) {
        this.empName = empName;
        this.empSal = empSal;
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Integer empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}

public class HighestSalaryBonus {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 55000),
                new Employee("Diana", 62000)
        );

       int maxSal= employees.stream()
               .mapToInt(Employee::getEmpSal)
               .max()
               .getAsInt();

       employees.stream().filter(f->f.getEmpSal()==maxSal)
               .forEach(x->{
                   System.out.println("Before emp sal "+x.getEmpSal());
                   x.setEmpSal(x.getEmpSal()+2000);
                   System.out.println("After emp sal "+x.getEmpSal());
               });



    }
}
