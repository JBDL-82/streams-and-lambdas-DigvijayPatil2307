import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeptAvgSalary {


    public static void deptAvgSalary(List<Employee> list) {

        Map<String,Double> result = list.stream()
                .collect(Collectors.groupingBy(emp -> emp.dept, Collectors.averagingDouble(emp -> emp.salary)));

        result.forEach((dept, AvgSalary) ->{
            System.out.println("Department : " + dept + " ,Avg.Salary : " + AvgSalary);
        });
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("digvijay",150000,"IT",10);
        Employee e2 = new Employee("suhas",80000,"civil",5);
        Employee e3 = new Employee("shubham",65000,"IT",6);
        Employee e4 = new Employee("sourabh",55000,"civil",3);
        Employee e5 = new Employee("shreyash",85000,"civil",9);
        Employee e6 = new Employee("sahil",45000,"HR",4);
        Employee e7 = new Employee("rohit",60000,"HR",8);
        Employee e8 = new Employee("nikhil",57000,"HR",2);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);

        deptAvgSalary(employees);
    }
}
