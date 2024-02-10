public class Employee {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String department;
    private int salary;

    public Employee(String imie, String nazwisko, String pesel, String department, int salary) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.department = department;
        this.salary = salary;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


