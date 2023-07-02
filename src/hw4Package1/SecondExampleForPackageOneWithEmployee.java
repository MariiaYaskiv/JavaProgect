package hw4Package1;

public class SecondExampleForPackageOneWithEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Smith", 100.00);
        employee.displayId();
        employee.displaySurname();
        employee.displaySalary();
        System.out.println("ID: " + employee.id);
        System.out.println("Surname: " + employee.surname);
        System.out.println("Salary: " + employee.salary);

    }
}