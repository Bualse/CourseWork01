/*
* - **Базовая сложность**
    1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
    2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
    3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
    4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
    5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
    7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
    8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
        1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        2. Посчитать сумму затрат на зарплаты в месяц.
        3. Найти сотрудника с минимальной зарплатой.
        4. Найти сотрудника с максимальной зарплатой.
        5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта 2).
        6. Получить Ф. И. О. всех сотрудников (вывести в консоль).

        - **Критерии оценки**

            – Корректно создан класс Employee.

            – Реализованы геттеры для всех полей класса.

            – Реализованы сеттеры для всех полей класса.

            – Создано поле типа Employee[10] для хранения записей о сотрудниках.

            – Созданы методы, которые корректно выводят информацию:

            - список всех сотрудников со всеми данными,
            - поиск сотрудника с минимальной зарплатой,
            - поиск сотрудника с максимальной зарплатой,
            - подсчет среднего значения зарплат,
            - список Ф. И. О. всех сотрудников.

            – Программа работает корректно при изменении любых данных о сотрудниках и выводит верный результат.*/

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
//        Employee ivanovIvanIvanovich = new Employee( "Иванов И. И.", "менджмент", 120_000);
//        System.out.println("ID: " + ivanovIvanIvanovich.getId() + " Сотрудник: " + ivanovIvanIvanovich.getFullName() + ", отдел: " + ivanovIvanIvanovich.getDepartmentEmployee() + ", зарплата: " + ivanovIvanIvanovich.getSalaryEmployee());
//
//        Employee sidorovaOlgaViktorovna = new Employee( "Сидорова О. В.", "секретариат", 78_000);
//        System.out.println("ID: " + sidorovaOlgaViktorovna.getId() + " Сотрудник: " + sidorovaOlgaViktorovna.getFullName() + ", отдел: " + sidorovaOlgaViktorovna.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna.getSalaryEmployee());
//
//        Employee sidorovaOlgaViktorovna1 = new Employee( "Сидорова О. В.", "секретариат", 57_000);
//        System.out.println("ID: " + sidorovaOlgaViktorovna1.getId() + " Сотрудник: " + sidorovaOlgaViktorovna1.getFullName() + ", отдел: " + sidorovaOlgaViktorovna1.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna1.getSalaryEmployee());
//
//        Employee sidorovaOlgaViktorovna2 = new Employee( "Сидорова О. В.", "секретариат", 98_000);
//        System.out.println("ID: " + sidorovaOlgaViktorovna2.getId() + " Сотрудник: " + sidorovaOlgaViktorovna2.getFullName() + ", отдел: " + sidorovaOlgaViktorovna2.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna2.getSalaryEmployee());
//
//        Employee sidorovaOlgaViktorovna3 = new Employee( "Сидорова О. В.", "секретариат", 110_000);
//        System.out.println("ID: " + sidorovaOlgaViktorovna3.getId() + " Сотрудник: " + sidorovaOlgaViktorovna3.getFullName() + ", отдел: " + sidorovaOlgaViktorovna3.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna3.getSalaryEmployee());
//
//        Employee sidorovaOlgaViktorovna4 = new Employee( "Сидорова О. В.", "секретариат", 69_000);
//        System.out.println("ID: " + sidorovaOlgaViktorovna4.getId() + " Сотрудник: " + sidorovaOlgaViktorovna4.getFullName() + ", отдел: " + sidorovaOlgaViktorovna4.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna4.getSalaryEmployee());
//
//        Employee sidorovaOlgaViktorovna5 = new Employee( "Сидорова О. В.", "секретариат", 87_000);
//        System.out.println("ID: " + sidorovaOlgaViktorovna5.getId() + " Сотрудник: " + sidorovaOlgaViktorovna5.getFullName() + ", отдел: " + sidorovaOlgaViktorovna5.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna5.getSalaryEmployee());
//
//        Employee sidorovaOlgaViktorovna6 = new Employee( "Сидорова О. В.", "секретариат", 89_000);
//        System.out.println("ID: " + sidorovaOlgaViktorovna6.getId() + " Сотрудник: " + sidorovaOlgaViktorovna6.getFullName() + ", отдел: " + sidorovaOlgaViktorovna6.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna6.getSalaryEmployee());
//
//        Employee sidorovaOlgaViktorovna7 = new Employee( "Сидорова О. В.", "секретариат", 79_000);
//        System.out.println("ID: " + sidorovaOlgaViktorovna7.getId() + " Сотрудник: " + sidorovaOlgaViktorovna7.getFullName() + ", отдел: " + sidorovaOlgaViktorovna7.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna7.getSalaryEmployee());
//
//        Employee sidorovaOlgaViktorovna8 = new Employee( "Сидорова О. В.", "секретариат", 77_000);
//        System.out.println("ID: " + sidorovaOlgaViktorovna8.getId() + " Сотрудник: " + sidorovaOlgaViktorovna8.getFullName() + ", отдел: " + sidorovaOlgaViktorovna8.getDepartmentEmployee() + ", зарплата: " + sidorovaOlgaViktorovna8.getSalaryEmployee());
//
//        System.out.println("==============================================================================");

        employees[0] = new Employee("Иванов И. И., ", "менджмент, ", 120_000);
        employees[1] = new Employee("Сидорова О. В., ", "секретариат, ", 78_000);
        employees[2] = new Employee("Свиридов П. В., ", "закупки, ", 57_000);
        employees[3] = new Employee("Захаркин Т. Л., ", "JavaDev, ", 350_000);
        employees[4] = new Employee("Пупкин С. К., ", "логистика, ", 110_000);
        employees[5] = new Employee("Жуков В. В., ", "клининг, ", 30_000);
        employees[6] = new Employee("Разина У. Д., ", "бухгалтерия, ", 87_000);
        employees[7] = new Employee("Малков Д. С., ", "менеджмент, ", 89_000);
        employees[8] = new Employee("Пикаль Л. И., ", "логистика, ", 79_000);
        employees[9] = new Employee("Смальков О. Д., ", "логистика, ", 77_000);

        for (Employee i : employees) {
            System.out.println(i);
        }

        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        calculateSumCostsOnSalaryPerMonth();
        calculateMiddleCountSalary();
        printListFullNameEmployees();

    }

    public static int findEmployeeWithMaxSalary() {
        int salary = employees[0].getSalaryEmployee();

        for (Employee employee : employees) {
            if (salary < employee.getSalaryEmployee()) {
                salary = employee.getSalaryEmployee();
            }
        }
        return salary;
    }

    public static int findEmployeeWithMinSalary() {
        int salary = employees[0].getSalaryEmployee();

        for (Employee employee : employees) {
            if (salary > employee.getSalaryEmployee()) {
                salary = employee.getSalaryEmployee();
            }
        }
        return salary;
    }

    public static void calculateSumCostsOnSalaryPerMonth() {

        int sum = 0;
        for (Employee t : employees) {
            sum += t.getSalaryEmployee();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
    }
    public static void calculateMiddleCountSalary() {

        int sum = 0;
        for (Employee t : employees) {
            sum += t.getSalaryEmployee();
//            10 employees
        }
        System.out.println("Среднее значение зарплаты в месяц: " + sum / 10);
    }

    public static void printListFullNameEmployees() {

        String sum = new String();
        for (Employee t : employees) {
            sum += t.getFullName();
        }
        System.out.println("Ф.И.О. всех сотрудников: " + sum);
    }
}




