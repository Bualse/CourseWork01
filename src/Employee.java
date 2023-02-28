public class Employee {

    private String fullName;
    private String departmentEmployee1;
    private String departmentEmployee2;
    private String departmentEmployee3;
    private String departmentEmployee4;
    private String departmentEmployee5;
    private int salaryEmployee;
    static int Counter;
    private int id;

    public Employee(int id, String fullName, String departmentEmployee, int salaryEmployee) {
        this.fullName = fullName;
        this.departmentEmployee1 = departmentEmployee;
        this.departmentEmployee2 = departmentEmployee;
        this.departmentEmployee3 = departmentEmployee;
        this.departmentEmployee4 = departmentEmployee;
        this.departmentEmployee5 = departmentEmployee;
        this.salaryEmployee = salaryEmployee;
        this.id = ++Counter;
    }

    public String getFullName() {

        return fullName;
    }

    public String getDepartmentEmployee1() {

        return departmentEmployee1;
    }

    public String getDepartmentEmployee2() {

        return departmentEmployee2;
    }

    public String getDepartmentEmployee3() {

        return departmentEmployee3;
    }

    public String getDepartmentEmployee4() {

        return departmentEmployee4;
    }

    public String getDepartmentEmployee5() {

        return departmentEmployee5;
    }

    public int getSalaryEmployee() {

        return salaryEmployee;
    }

    public int getId() {

        return id;
    }

    public void setDepartmentEmployee1(String departmentEmployee1) {

        this.departmentEmployee1 = departmentEmployee1;
    }

    public void setDepartmentEmployee2(String departmentEmployee2) {

        this.departmentEmployee2 = departmentEmployee2;
    }

    public void setDepartmentEmployee3(String departmentEmployee3) {

        this.departmentEmployee3 = departmentEmployee3;
    }

    public void setDepartmentEmployee4(String departmentEmployee4) {

        this.departmentEmployee4 = departmentEmployee4;
    }

    public void setDepartmentEmployee5(String departmentEmployee5) {

        this.departmentEmployee5 = departmentEmployee5;
    }

    public void setSalaryEmployee(int salaryEmployee) {

        this.salaryEmployee = salaryEmployee;
    }

    public String toString() {
        return "Id: " + id + " ФИО: " + fullName + " Отдел: " + departmentEmployee1 + " Зарплата: " + salaryEmployee;
    }


}
