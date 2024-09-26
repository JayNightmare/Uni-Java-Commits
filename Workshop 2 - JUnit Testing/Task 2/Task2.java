import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private final String id;
    private final  String name;
    private final int age;
    private double salary;

    // Constructor
    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", salary=" + salary +
            '}';
    }
}

public class Task2 {
    public static void main(String[] args) {
        // Creating a list of Employee objects
        List<Employee> employees = Arrays.asList(
            new Employee("E01", "Alice", 30, 5000.0),
            new Employee("E02", "Bob", 40, 5500.0),
            new Employee("E03", "Charlie", 25, 4800.0)
        );

        // Printing Employee details using Java Streams
        printStream(employees);

        // Finding and printing average age of Employees
        double averageAge = getAverageAge(employees);
        System.out.println("Average Age of Employees: " + averageAge);

        // Increasing salary of all employees by 100
        increaseSalary(employees, 100.0);
        System.out.println("Employees after salary increase:");
        printStream(employees);
    }

    // Print Employee details
    private static void printStream(List<Employee> employees) {
        employees.stream().forEach(e -> System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Age: " + e.getAge() + ", Salary: " + e.getSalary()));
    }

    // Calculate average age of Employees
    private static double getAverageAge(List<Employee> employees) {
        return employees.stream()
                        .collect(Collectors.averagingInt(Employee::getAge));
    }

    // Increase salary of Employees by a given amount
    private static void increaseSalary(List<Employee> employees, double increaseAmount) {
        employees.forEach(e -> e.setSalary(e.getSalary() + increaseAmount));
    }
}
