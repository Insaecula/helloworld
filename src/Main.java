//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//task1
        String firstName = "Ivanon";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О сотрудника " + fullName);
        //task 2
        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета -  " + fullName.toUpperCase());


        //task3
        fullName = "Иванов Семён Семёнович";
        String nameEmployee = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + nameEmployee);


    }
}
