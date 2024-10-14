import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.workshop4.workshoptasks.task2.Employee;
import com.workshop4.workshoptasks.task2.Workshop4Task2;

class Workshop4Task2Test {
    
    @Test
    void testGetAverageAge() {
        List<Employee> employees = Arrays.asList(
            new Employee("1", "Alice", 30, 5000),
            new Employee("2", "Bob", 25, 4000),
            new Employee("3", "Charlie", 35, 4500)
        );
        double averageAge = Workshop4Task2.getAverageAge(employees);
        assertEquals(30.0, averageAge, 0.1);
    }

    @Test
    void testIncreaseSalary() {
        List<Employee> employees = Arrays.asList(
            new Employee("1", "Alice", 30, 5000),
            new Employee("2", "Bob", 25, 4000),
            new Employee("3", "Charlie", 35, 4500)
        );
        Workshop4Task2.increaseSalary(employees);
        assertEquals(5100, employees.get(0).getSalary(), 0.1);
        assertEquals(4100, employees.get(1).getSalary(), 0.1);
        assertEquals(4600, employees.get(2).getSalary(), 0.1);
    }

    @Test
    void testGetAverageNewSalary() {
        List<Employee> employees = Arrays.asList(
            new Employee("1", "Alice", 30, 5000),
            new Employee("2", "Bob", 25, 4000),
            new Employee("3", "Charlie", 35, 4500)
        );
        Workshop4Task2.increaseSalary(employees);  // Increase salary first
        double averageSalary = Workshop4Task2.getAverageNewSalary(employees);
        assertEquals(4600.0, averageSalary, 0.1);
    }
}
