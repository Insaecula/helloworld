import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Random RANDOM = new Random();
    private static final String[] NAME = {"Дмитрий", "Егор", "Александр", " Кирилл", "Ви"};
    private static final String[] LASTNAME = {"Дмитриевич", "Егорович", "Александрович", "Кириллович", " Виевич"};
    private static final String[] SURNAME = {"Дмитриев", " Егоров", " Александров", "Кириллов", "Виев"};

    private static Employee[] employee = new Employee[10];

    private static void initialEmployee() {
        for (int i = 0; i < employee.length; i++) {
            String fullName = SURNAME[RANDOM.nextInt(SURNAME.length)] + " " +
                    NAME[RANDOM.nextInt(NAME.length)] + " " +
                    LASTNAME[RANDOM.nextInt(LASTNAME.length)];

            employee[i] = new Employee(fullName, RANDOM.nextInt(1, 6), RANDOM.nextInt(30000, 150000));

        }
    }

    public static void main(String[] args) {
        initialEmployee();
        print();
        System.out.println("Зарплата работяг " + getSumSalaries());
        System.out.println("Зарплата работяги с мин зп " + findEmployeeWithMinSalary());
        System.out.println("Зарплата работяги с макс зп " + findEmployeeWithMaxSalary());
        System.out.println("Зарплата работяги со средней зп " + sumMidleSalarys());
        printFullName();

    }

    private static void print() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    private static int getSumSalaries() {
        int sum = 0;
        for (Employee employee : employee) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeMinSalary = employee[0];
        for (Employee employee : employee) {
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeMaxSalary = employee[0];
        for (Employee employee : employee) {
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    private static double sumMidleSalarys() {
        return (double) getSumSalaries() / employee.length;
    }

    private static void printFullName() {
        for (Employee employee : employee) {
            System.out.println(employee.getFullName());
        }
    }

}