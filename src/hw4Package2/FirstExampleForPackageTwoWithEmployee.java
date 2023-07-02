package hw4Package2;

import hw4Package1.Employee;

public class FirstExampleForPackageTwoWithEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Stepan", 100.00);
        employee.displaySurname();
        System.out.println("Surname: " + employee.surname);
    }
}