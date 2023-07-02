package hw4Package1;

public class FirstExampleForPackageOneWithEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Smith", 100.00);
        employee.displayId();
        employee.displaySurname();
        System.out.println("ID: " + employee.id);
        System.out.println("Surname: " + employee.surname);

    }
}