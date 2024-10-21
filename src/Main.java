//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int tempereture = 5;

    public static void main(String[] args) {
        // task 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возвраст человека равен  " + age + "  то  он совершеннолетний");
        }
        if (age < 18) {
            System.out.println(age + " он не достиг совершеннолетия  нужно немного подождать");
        }
        //task2

        int temperature = 4;
        if (temperature > 5) {
            System.out.println("На улице + " + temperature + "  градусов можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице + " + temperature + " Нужно надеть шапку ");
        }
        //task 3
        int speed = 50;
        if (speed > 60) {
            System.out.println(" Если скорость  больше " + speed + " придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость   меньше " + speed + " можно ездить спокойно");
            //task 4
            int peopleAge = 24;
            if (peopleAge >= 2 && peopleAge <= 6) {
                System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в детский сад ");
            }
              else if (peopleAge > 7 && peopleAge < 17){
                System.out.println("Если возраст человека равен " + peopleAge + "  Он должен ходить в шкилу");
                }
                else if (peopleAge >= 18 && peopleAge <= 24) {
                System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в институт");
            }
                else if (peopleAge >24 && peopleAge <60) {
                System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить на работу ");
            }
            //task 5
            int childrenAge = 7;
                if (childrenAge <5) {
                    System.out.println("Если возраст ребенка равен" + childrenAge + " нельзя кататься на аттракционе");
                }
                else if (childrenAge > 5 && childrenAge < 14) {
                    System.out.println("Если возраст ребенка равен " + childrenAge + " может кататься на аттракционе в сопровождении взрослого");
                }
                else if ( childrenAge > 14) {
                    System.out.println("Если возраст ребенка равен " + childrenAge + " может кататься без сопровождения взрослого");
                }
            //task 6
            int trainSeat = 59;
                if ( trainSeat >= 60 && trainSeat <= 102 ) {
                    System.out.println("В вагоне есть " + trainSeat + " стоячих мест");
                }
                else if (trainSeat == 102 ) {
                    System.out.println("В вагоне " + trainSeat + " нет мест");
                }
                else if ( trainSeat == 59 && trainSeat <60) {
                    System.out.println(" В вагоне есть " + trainSeat + " сидящих мест ");
                }
            //task 7
            int number1 = 2;
                int number2 = 2;
                int number3 = 3 ;
                if (number1 <number2 && number2 > number1) {
                    System.out.println("Это число больше  " + number1);
                }
                else if ( number2 > number1  && number2 < number3) {
                    System.out.println(" Это число самое большое " + number2);
                }
                else if ( number3 > number1 && number3 > number2) {
                    System.out.println(" Это число самое большое " + number3);
                }
                    }
                }
            }