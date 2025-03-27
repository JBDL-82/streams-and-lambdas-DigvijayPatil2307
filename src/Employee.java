public class Employee {

    String name;
    double salary;
    String dept;
    int experience;

    public Employee(String name, double salary, String dept, int experience) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.experience = experience;
    }


    /**
     * overriding the toString() method
     */
    @Override
    public String toString() {
        return "{ Name: " + name + ", Salary: " + salary +
                ", Department: " + dept + ", Experience: " + experience + " years }\n";
    }

}
