public class EmployeesInfo {

    public static double averageSalary(Employee[] employees) {
        double sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary / employees.length;
    }

    public static int minSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public static int maxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static int countEmployeesInDepartment(Employee[] employees, String department) {
        int employeesCounter = 0;
        for (Employee employee : employees) {
            if (department.equals(employee.getDepartment())) {
                employeesCounter++;
            }
        }
        return employeesCounter;
    }
}
