import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterBySalary {
    public static void sortBySalary(List<Employee> list) {

        List<Employee> result = list.stream()
                .filter((obj) -> obj.salary > 50_000)
                .collect(Collectors.toList());

        result.forEach(x -> System.out.println(x));

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

        sortBySalary(employees);
    }
}
