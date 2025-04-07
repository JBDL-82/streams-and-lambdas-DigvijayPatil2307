import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterByDept {


    public static void sortByDept(List<Employee> list) {
       Map<String, List<Employee>> result =  list.stream()
                .collect(Collectors.groupingBy(obj -> obj.dept));

       result.forEach((dept, employees) -> {
           System.out.println("Department : " + dept);
           employees.forEach((employee) -> System.out.println(employee));
       });
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

        sortByDept(employees);
    }
}
