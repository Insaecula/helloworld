public class Employee {

    private static int employeeId = 1;

    private int id;
    private String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        id = employeeId++;
      this.fullName = fullName;
      this.salary = salary;
      this.department = department;

    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fullName='" + fullName + '\'' + ", department=" + department + ", salary=" + salary + '}';
    }
}

