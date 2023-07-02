package hw4Package1;

public class Employee {
    int id;
    public String surname;
    private double salary;

    Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String surname, double salary) {
        this(id);
        this.surname = surname;
        this.salary = salary;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    void displayId() {
        System.out.println("ID: " + id);
    }

    public void displaySurname() {
        System.out.println("Surname: " + surname);
    }

    private void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}
