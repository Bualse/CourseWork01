public class Employee {

    private String fullName;
    private String departmentEmployee;
    private int salaryEmployee;
    static int Counter;
    private int id;

    public Employee(int id, String fullName, String departmentEmployee, int salaryEmployee) {
        this.fullName = fullName;
        this.departmentEmployee = departmentEmployee;
        this.salaryEmployee = salaryEmployee;
        this.id = ++Counter;
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

    public String toString() {
        return "Id: " + id + " ФИО: " + fullName + " Отдел: " + departmentEmployee + " Зарплата: " + salaryEmployee;
    }


}
