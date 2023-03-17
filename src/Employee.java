import java.util.Objects;

public class Employee {

    private final String fullName;
    private int departmentEmployee;
    private int salaryEmployee;
    static int Counter;
    private final int id;

    public Employee(String fullName, int departmentEmployee, int salaryEmployee) {
        this.fullName = fullName;
        this.departmentEmployee = departmentEmployee;
        this.salaryEmployee = salaryEmployee;
        this.id = ++Counter;
    }

    public String getFullName() {

        return fullName;
    }

    public int getDepartmentEmployee() {

        return departmentEmployee;
    }

    public int getSalaryEmployee() {

        return salaryEmployee;
    }

    public int getId() {

        return id;
    }

    public void setDepartmentEmployee(int departmentEmployee) {

        this.departmentEmployee = departmentEmployee;
    }

    public void setSalaryEmployee(int salaryEmployee) {

        this.salaryEmployee = salaryEmployee;
    }


    @Override
    public String toString() {
        return "ID: " + id + " Сотрудник: " + fullName + " отдел: " + departmentEmployee + ", зарплата: " + salaryEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentEmployee == employee.departmentEmployee && salaryEmployee == employee.salaryEmployee && id == employee.id && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departmentEmployee, salaryEmployee, id);
    }
}
