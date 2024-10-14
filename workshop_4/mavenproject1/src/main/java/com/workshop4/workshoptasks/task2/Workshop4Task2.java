package com.workshop4.workshoptasks.task2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jordan
 */

public class Workshop4Task2 {
    public static void printStream(List<Employee> employees) {
        employees.stream().forEach(e -> System.out.println(e.getId() + " " + e.getName() + " " + e.getAge() + " " + e.getSalary()));
    }

    public static double getAverageAge(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getAge).average().orElse(0.0);
    }

    public static void increaseSalary(List<Employee> employees) {
        employees.stream().forEach(e -> e.setSalary(e.getSalary() + 100));
    }

    public static double getAverageNewSalary(List<Employee> employees) {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "John Doe", 30, 50000));
        employees.add(new Employee("2", "Jane Doe", 25, 60000));
        employees.add(new Employee("3", "Jim Beam", 35, 70000));

        printStream(employees);
        System.out.println("Average age: " + getAverageAge(employees));
        increaseSalary(employees);
        System.out.println("Average new salary: " + getAverageNewSalary(employees));
    }
}
