package hw4Package2;

import hw4Package1.Employee;

public class ThirdExampleForPackageOneWithEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Smith", 10000.00);
        employee1.displayId();
        employee1.displaySurname();
        System.out.println("ID: " + employee1.id);
        System.out.println("Surname: " + employee1.surname);
    }
}
