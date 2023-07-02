package hw4Package2;

import hw4Package1.Employee;

public class SecondExampleForPackageOneWithEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Smith", 10000.00);
        employee1.displayId();
        employee1.displaySurname();
        employee1.displaySalary();
        System.out.println("ID: " + employee1.id);
        System.out.println("Surname: " + employee1.surname);
        System.out.println("Salary: " + employee1.salary);
    }
}