public class EmployeesInfo {

    public static double averageSalary(Employee[] employees) {
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sumSalary += employees[i].getSalary();
        }
        return sumSalary / employees.length;
    }

    public static int minSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static int maxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static int countAllEmployees(Employee[] employees) {
        return employees.length;
    }

    public static int countEmployeesInDepartment(Employee[] employees, String department) {
        int employeesCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (department.equals(employees[i].getDepartment())) {
                employeesCounter++;
            }
        }
        return employeesCounter;
    }
}
