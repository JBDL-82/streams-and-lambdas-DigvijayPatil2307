import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeHighSalary {

    public static void findEmployeeWithHighSalary(List<Employee> list) {

        Optional<Employee> highSalaryEmp = list.stream()
                .reduce((emp1, emp2) -> emp1.salary > emp2.salary ? emp1 : emp2);

        highSalaryEmp.ifPresent((emp) -> System.out.println("High Salary employee is : " + emp));

    }

    public static void main(String[] args) {
        Employee e1 = new Employee("digvijay",150000,"IT",0);
        Employee e2 = new Employee("suhas",80000,"civil",5);
        Employee e3 = new Employee("shubham",65000,"IT",6);
        Employee e4 = new Employee("sourabh",55000,"civil",3);
        Employee e5 = new Employee("sahil",45000,"HR",8);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        findEmployeeWithHighSalary(employees);
    }
}
