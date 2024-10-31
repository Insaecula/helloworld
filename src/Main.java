//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
           for ( int i = 0; i <=10; i = i + 1) {
               System.out.println(i);
           }
           //task2
           for ( int i = 10; i >= 0; i = i - 1) {
               System.out.println(i);
           }
           //task 3
        for ( int i = 0; i <= 17; i = i + 2 ) {
            System.out.println(i);
        }
        //task 4
        for ( int i = 10; i >=- 10; i = i - 1) {
            System.out.println(i);
        }
        //task 5
        for ( int i = 1904; i <= 2096; i = i + 4 ) {
            System.out.println("Вискосоный год " + i);
        }
        //task 6
        for ( int i = 7 ; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //task 7
        for ( int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //task 8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++  ) {
            //task 9 сразу тут пишу переменная не выводиться
            total = total + salary;
            total = total + total/100;
            System.out.println("Месяц " + i  + " Итого " + total);
        }
        System.out.println(total);
        //task 10
        int table = 2;
        int multiPliCation = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
            }
        }
