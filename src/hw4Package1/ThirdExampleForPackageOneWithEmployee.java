package hw4Package1;

public class ThirdExampleForPackageOneWithEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Smith", 100.00);
        employee.displayId();
        System.out.println("ID: " + employee.id);
    }
}