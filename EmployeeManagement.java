import java.util.ArrayList;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    // Increase salary by percentage
    public void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }

    // Display employee details
    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + 
                           " | Dept: " + department + 
                           " | Salary: ₹" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        System.out.println("🏢 Employee Management System (Demo) 🏢\n");

        // Create employee list
        ArrayList<Employee> employees = new ArrayList<>();

        // Add some sample employees
        employees.add(new Employee(101, "Manikumar", "DevOps", 75000));
        employees.add(new Employee(102, "Ravi", "Development", 68000));
        employees.add(new Employee(103, "Priya", "Testing", 59000));
        employees.add(new Employee(104, "Suresh", "HR", 50000));

        // Display all employees
        System.out.println("👥 All Employees:");
        for (Employee emp : employees) {
            emp.displayInfo();
        }

        System.out.println("\n💰 Giving 10% salary raise to all employees...\n");

        // Increase salary for all
        for (Employee emp : employees) {
            emp.raiseSalary(10);
        }

        // Display again after salary raise
        System.out.println("📈 Updated Employee Details:");
        for (Employee emp : employees) {
            emp.displayInfo();
        }

        // Example of specific action
        System.out.println("\n🔍 Searching for employee with ID 103...");
        for (Employee emp : employees) {
            if (emp.getId() == 103) {
                System.out.println("✅ Found Employee: " + emp.getName() + 
                                   " | New Salary: ₹" + emp.getSalary());
            }
        }

        System.out.println("\n✅ Program finished successfully!");
    }
}
