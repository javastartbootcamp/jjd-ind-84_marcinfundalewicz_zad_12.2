import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "employees.csv";
        File file = new File(fileName);
        Employee[] employees = FileUtils.fillTheArrayOfEmployees(fileName);
        if (file.exists()) {
            File stats = new File("stats.txt");
            try (FileWriter fileWriter = new FileWriter(stats)) {
                fileWriter.write("Średnia wypłata pracowników wynosi: " + EmployeesInfo.averageSalary(employees) + " zł" + "\n");
                fileWriter.write("Minimalna wypłata pracownika wynosi: " + EmployeesInfo.minSalary(employees) + " zł" + "\n");
                fileWriter.write("Maksymalna wypłata pracownika wynosi: " + EmployeesInfo.maxSalary(employees) + " zł" + "\n");
                fileWriter.write("Liczba wszystkich pracowników wynosi: " + EmployeesInfo.countAllEmployees(employees) + "\n");
                fileWriter.write("Liczba wszystkich pracowników działu IT wynosi: " + EmployeesInfo.countEmployeesInDepartment(employees, "IT") + "\n");
                fileWriter.write("Liczba wszystkich pracowników działu MENAGMENT wynosi: " + EmployeesInfo.countEmployeesInDepartment(employees, "MANAGEMENT") + "\n");
                fileWriter.write("Liczba wszystkich pracowników działu SUPPORT wynosi: " + EmployeesInfo.countEmployeesInDepartment(employees, "SUPPORT") + "\n");
            } catch (IOException e) {
                System.out.println("Coś poszło nie tak");
            }
        }
    }
}
