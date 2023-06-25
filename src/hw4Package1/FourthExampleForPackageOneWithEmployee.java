package hw4Package1;

public class FourthExampleForPackageOneWithEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Smith", 100.00);
        employee.displaySalary();
        System.out.println("Salary: " + employee.salary);

    }
}
