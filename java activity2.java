// Superclass
class Employee {

    public void calculateSalary() {
        System.out.println("Salary calculation for employee.");
    }
}

// Subclass 1
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Full-Time Employee Salary: ₹" + monthlySalary);
    }
}

// Subclass 2
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Part-Time Employee Salary: ₹" + salary);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(50000);
        Employee emp2 = new PartTimeEmployee(80, 300);

        emp1.calculateSalary();
        emp2.calculateSalary();
    }
}