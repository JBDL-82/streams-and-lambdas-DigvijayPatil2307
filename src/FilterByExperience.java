import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterByExperience {

    public static void sortByExperience(List<Employee> list) {

        Map<Boolean, List<Employee>> empExp = list.stream()
                .collect(Collectors.partitioningBy((emp) -> emp.experience >= 5));

        /**
         * if boolean -> true ---> then exp >= 5
         * if boolean -> false ---> then exp < 5
         */

        System.out.print("Employees with Experience more/Equal 5 years : ");
        empExp.get(true).forEach((emp) -> System.out.println(emp));

        System.out.print("Employees with Experience less than 5 years : ");
        empExp.get(false).forEach((emp) -> System.out.println(emp));
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

        sortByExperience(employees);
    }
}
