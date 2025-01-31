
public class Main {


    // Поле для хранения сотрудников
    public static void main(String[] args) {
        // Добавление записей в "хранилище"

        employees[0] = new Employee(1, 120000, 1, "Игорь Иванов");
        employees[1] = new Employee(2, 67323.50, 2, "Анна Анатольевна");
        employees[2] = new Employee(3, 62000.50, 2, "Лиськова Ирина");
        employees[3] = new Employee(4, 32000, 2, "Павлова Юлия");
        employees[4] = new Employee(5, 150000, 2, "Петлер Андрей");

        printAllEmployees();
        System.out.println("Общая сумма ежемесячных расходов на заработную плату: " + calculateTotalSalary());
        System.out.println("Работник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("Работник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        printAllEmployeeNames();

    }
    private static Employee[] employees = new Employee[10];

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {

        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary())) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {

        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary())) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeCount++;
            }
        }
        return employeeCount == 0 ? 0 : totalSalary / employeeCount;
    }

    public static void printAllEmployeeNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
