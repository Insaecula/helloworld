import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Random RANDOM = new Random();
    private static String[] NAME = {"Дмитрий", "Егор", "Александр", " Кирилл", "Ви"};
    private static String[] LASTNAME = {"Дмитриевич", "Егорович", "Александрович", "Кириллович", " Виевич"};
    private static String[] SURNAME = {"Дмитриев", " Егоров", " Александров", "Кириллов", "Виев"};

    private static Employee[] EMPLOYEES = new Employee[10];

    private static void initialEmployee() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            String fullName = SURNAME[RANDOM.nextInt(SURNAME.length)] + " " +
                    NAME[RANDOM.nextInt(NAME.length)] + " " +
                    LASTNAME[RANDOM.nextInt(LASTNAME.length)];

            EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(1, 6), RANDOM.nextInt(30000, 150000));

        }
    }

    public static void main(String[] args) {
        initialEmployee();
        print();
        System.out.println("Зарплата работяг " + sumSalarys());
        System.out.println("Зарплата работяги с мин зп " + EmployeeMinSalary());
        System.out.println("Зарплата работяги с макс зп " + EmployeeMaxSalary());
        System.out.println("Зарплата работяги со средней зп " + sumMidleSalarys());
        printFullName();

    }

    private static void print() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int sumSalarys() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee EmployeeMinSalary() {
        Employee employeeMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    private static Employee EmployeeMaxSalary() {
        Employee employeeMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    private static double sumMidleSalarys() {
        return  (double) sumSalarys() / EMPLOYEES.length;
    }
    private static void printFullName() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }

}