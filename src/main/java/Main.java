import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "employees.csv";
        File file = new File(fileName);
        Employee[] employees = FileUtils.fillTheArrayOfEmployees(file);
        if (file.exists()) {
            File stats = new File("stats.txt");
            try (FileWriter fileWriter = new FileWriter(stats)) {
                fileWriter.write("Średnia wypłata: " + EmployeesInfo.averageSalary(employees) + " zł\n");
                fileWriter.write("Minimalna wypłata: " + EmployeesInfo.minSalary(employees) + " zł\n");
                fileWriter.write("Maksymalna wypłata: " + EmployeesInfo.maxSalary(employees) + " zł\n");
                fileWriter.write("Liczba pracowników IT: " + EmployeesInfo.countEmployeesInDepartment(employees, "IT") + "\n");
                fileWriter.write("Liczba pracowników Management: " + EmployeesInfo.countEmployeesInDepartment(employees, "Management") + "\n");
                fileWriter.write("Liczba pracowników Support: " + EmployeesInfo.countEmployeesInDepartment(employees, "Support") + "\n");
            } catch (IOException e) {
                System.out.println("Coś poszło nie tak");
            }
        }
    }
}
