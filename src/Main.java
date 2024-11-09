//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int[] expenses = new int[]{1, 2, 3, 4, 5};
        int totalExpenses = 0;
        int minExpense = expenses[0];
        int maxExpense = expenses[0];
        int sum = 0;
//task 2
        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
            if (expenses[i] < minExpense) {
                minExpense = expenses[i];
            }
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];

            }
        }
        //task 3

        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        double average = (double) sum / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " Рублей");

        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей ");
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей");
        //task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }
    }
}






