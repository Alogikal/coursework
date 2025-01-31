import java.util.Objects;

public class Employee {
    private static int idCounter = 1;

    private int id;
    private String fullName;
    private int department;
    private double salary;

    public Employee(int id, double salary, int depatment, String fullName) {
        this.id = id;
        this.salary = salary;
        this.department = depatment;
        this.fullName = fullName;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepatment(int depatment) {
        this.department = depatment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && department == employee.department && Double.compare(salary, employee.salary) == 0 && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, department, salary);
    }

    @Override
    public String toString() {
        return  fullName + " " + salary;
    }
}

