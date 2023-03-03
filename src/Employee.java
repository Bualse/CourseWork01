import java.util.Objects;

public class Employee {

    private String fullName;
    private String departmentEmployee;
    private int salaryEmployee;
    static int сounter;
    private int id;

    public Employee(String fullName, String departmentEmployee, int salaryEmployee) {
        this.fullName = fullName;
        this.departmentEmployee = departmentEmployee;
        this.salaryEmployee = salaryEmployee;
        this.id = ++сounter;
    }

    public String getFullName() {

        return fullName;
    }

    public String getDepartmentEmployee() {

        return departmentEmployee;
    }

    public int getSalaryEmployee() {

        return salaryEmployee;
    }

    public int getId() {

        return id;
    }

    public void setDepartmentEmployee(String departmentEmployee) {

        this.departmentEmployee = departmentEmployee;
    }

    public void setSalaryEmployee(int salaryEmployee) {

        this.salaryEmployee = salaryEmployee;
    }


    @Override
    public String toString() {
        return "ID: " + id + " Сотрудник: " + fullName + " отдел: " + departmentEmployee + " зарплата: " + salaryEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salaryEmployee == employee.salaryEmployee && id == employee.id && fullName.equals(employee.fullName) && departmentEmployee.equals(employee.departmentEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departmentEmployee, salaryEmployee, id);
    }
}
