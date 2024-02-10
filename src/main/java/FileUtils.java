import java.io.*;
import java.util.Scanner;

public class FileUtils {
    private static Employee createEmployee(String csvFileLine) {
        String[] emplyeeInfo = csvFileLine.split(";");
        String name = emplyeeInfo[0];
        String surname = emplyeeInfo[1];
        String pesel = emplyeeInfo[2];
        String department = emplyeeInfo[3];
        int salary = Integer.parseInt(emplyeeInfo[4]);
        return new Employee(name, surname, pesel, department, salary);
    }

    public static Employee[] fillTheArrayOfEmployees(String fileName) throws FileNotFoundException {
        int fileLines = calculateLines(fileName);
        Employee[] employees = new Employee[fileLines];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (int i = 0; i < fileLines; i++) {
                String csvFileLine = scanner.nextLine();
                employees[i] = createEmployee(csvFileLine);
            }
        }
        return employees;
    }

    private static int calculateLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                lines++;
                scanner.nextLine();
            }
        }
        return lines;
    }
}
