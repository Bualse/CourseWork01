public class Main {

    public static void main(String[] args) {
        Employee ivanovIvanIvanovich = new Employee(0,"Иванов И. И.", "менджмент", 120_000);
        System.out.println("ID: " + ivanovIvanIvanovich.getId() + ", Сотрудник: " + ivanovIvanIvanovich.getFullName() + ", отдел: " + ivanovIvanIvanovich.getDepartmentEmployee() + ", зарплата: " + ivanovIvanIvanovich.getSalaryEmployee());

        Employee sidorovaOlgaViktorovna = new Employee(0,"Сидорова О. В.", "секретариат", 78_000);
        System.out.println("ID: " + sidorovaOlgaViktorovna.getId() + ", Сотрудник: " + sidorovaOlgaViktorovna.getFullName() + ", отдел: " + sidorovaOlgaViktorovna.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna.getSalaryEmployee());

        Employee sidorovaOlgaViktorovna1 = new Employee(0,"Сидорова О. В.", "секретариат", 57_000);
        System.out.println("ID: " + sidorovaOlgaViktorovna1.getId() + ", Сотрудник: " + sidorovaOlgaViktorovna1.getFullName() + ", отдел: " + sidorovaOlgaViktorovna1.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna1.getSalaryEmployee());

        Employee sidorovaOlgaViktorovna2 = new Employee(0,"Сидорова О. В.", "секретариат", 98_000);
        System.out.println("ID: " + sidorovaOlgaViktorovna2.getId() + ", Сотрудник: " + sidorovaOlgaViktorovna2.getFullName() + ", отдел: " + sidorovaOlgaViktorovna2.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna2.getSalaryEmployee());

        Employee sidorovaOlgaViktorovna3 = new Employee(0,"Сидорова О. В.", "секретариат", 110_000);
        System.out.println("ID: " + sidorovaOlgaViktorovna3.getId() + ", Сотрудник: " + sidorovaOlgaViktorovna3.getFullName() + ", отдел: " + sidorovaOlgaViktorovna3.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna3.getSalaryEmployee());

        Employee sidorovaOlgaViktorovna4 = new Employee(0,"Сидорова О. В.", "секретариат", 69_000);
        System.out.println("ID: " + sidorovaOlgaViktorovna4.getId() + ", Сотрудник: " + sidorovaOlgaViktorovna4.getFullName() + ", отдел: " + sidorovaOlgaViktorovna4.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna4.getSalaryEmployee());

        Employee sidorovaOlgaViktorovna5 = new Employee(0,"Сидорова О. В.", "секретариат", 87_000);
        System.out.println("ID: " + sidorovaOlgaViktorovna5.getId() + ", Сотрудник: " + sidorovaOlgaViktorovna5.getFullName() + ", отдел: " + sidorovaOlgaViktorovna5.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna5.getSalaryEmployee());

        Employee sidorovaOlgaViktorovna6 = new Employee(0,"Сидорова О. В.", "секретариат", 89_000);
        System.out.println("ID: " + sidorovaOlgaViktorovna6.getId() + ", Сотрудник: " + sidorovaOlgaViktorovna6.getFullName() + ", отдел: " + sidorovaOlgaViktorovna6.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna6.getSalaryEmployee());

        Employee sidorovaOlgaViktorovna7 = new Employee(0,"Сидорова О. В.", "секретариат", 79_000);
        System.out.println("ID: " + sidorovaOlgaViktorovna7.getId() + ", Сотрудник: " + sidorovaOlgaViktorovna7.getFullName() + ", отдел: " + sidorovaOlgaViktorovna7.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna7.getSalaryEmployee());

        Employee sidorovaOlgaViktorovna8 = new Employee(0,"Сидорова О. В.", "секретариат", 77_000);
        System.out.println("ID: " + sidorovaOlgaViktorovna8.getId() + ", Сотрудник: " + sidorovaOlgaViktorovna8.getFullName() + ", отдел: " + sidorovaOlgaViktorovna8.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna8.getSalaryEmployee());

        System.out.println("==============================================================================");

        Employee[] employees = new Employee[10];
        employees[0] = new Employee(0,"Иванов И. И., " , "менджмент, ", 120_000);
        employees[1] = new Employee(0,"Сидорова О. В., ", "секретариат, ", 78_000);
        employees[2] = new Employee(0,"Сидорова О. В., ", "секретариат, ", 57_000);
        employees[3] = new Employee(0,"Сидорова О. В., ", "секретариат, ", 98_000);
        employees[4] = new Employee(0,"Сидорова О. В., ", "секретариат, ", 110_000);
        employees[5] = new Employee(0,"Сидорова О. В., ", "секретариат, ", 69_000);
        employees[6] = new Employee(0,"Сидорова О. В., ", "секретариат, ", 87_000);
        employees[7] = new Employee(0,"Сидорова О. В., ", "секретариат, ", 89_000);
        employees[8] = new Employee(0,"Сидорова О. В., ", "секретариат, ", 79_000);
        employees[9] = new Employee(0,"Сидорова О. В., ", "секретариат, ", 77_000);

        for (Employee i: employees) {
            System.out.println(i);
        }


        int result = employees.findEmployeeWithMaxSalary(Employee[] test);
        System.out.println(result);

    }

    public static int findEmployeeWithMaxSalary(Employee[] test) {
        int salary = test[0].getSalaryEmployee();
        int employeeNumber = 0;
        for (int i = 0; i < test.length; i++) {
            if (salary < test[i].getSalaryEmployee()) {
                salary = test[i].getSalaryEmployee();
                employeeNumber = i;
            }
        }
        return test[employeeNumber].getSalaryEmployee();
    }
//        public static int findEmployeeWithMaxSalary(int SalaryEmployee) {
//        Employee[] employees = new Employee[10];
//
//        int maxSalaryEmployee = -1;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] > maxSalaryEmployee) {
//                maxSalaryEmployee = employees[i];
//            }
//        }


}