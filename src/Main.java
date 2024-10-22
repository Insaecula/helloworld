//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int tempereture = 5;

    public static void main(String[] args) {
        // task 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возвраст человека равен  " + age + "  то  он совершеннолетний");
        } else {
            System.out.println(age + " он не достиг совершеннолетия  нужно немного подождать");
        }
        //task2

        int temperature = 4;
        if (temperature > 5) {
            System.out.println("На улице + " + temperature + "  градусов можно идти без шапки");
        } else {
            System.out.println("На улице + " + temperature + " Нужно надеть шапку ");
        }
        //task 3
        int speed = 50;
        if (speed > 60) {
            System.out.println(" Если скорость больше " + speed + "км/ч придется заплатить штраф");
        } else {
            System.out.println("Если скорость меньше " + speed + "км/ч можно ездить спокойно");
        }
        //task 4
        int peopleAge = 24;
        if (peopleAge >= 2 && peopleAge <= 6) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в детский сад ");
        } else if (peopleAge > 7 && peopleAge < 17) {
            System.out.println("Если возраст человека равен " + peopleAge + "  Он должен ходить в шкилу");
        } else if (peopleAge >= 18 && peopleAge <= 24)
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в институт");
        else if (peopleAge > 24 && peopleAge < 60) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить на работу ");
        }
        //task 5
        int childRenAge = 7;
        if (childRenAge < 5) {
            System.out.println("Если возраст ребенка равен" + childRenAge + " нельзя кататься на аттракционе");
        }
        if (childRenAge > 5 && childRenAge < 14) {
            System.out.println("Если возраст ребенка равен " + childRenAge + " может кататься на аттракционе в сопровождении взрослого");
        }
        if (childRenAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childRenAge + " может кататься без сопровождения взрослого");
        }
        //task 6
        int trainSeat = 59;
        if (trainSeat < 102) {
            System.out.println("В вагоне есть местa");
        } else if (trainSeat < 60) {
            System.out.println("В вагоне  есть сидячие места");
        } else if (trainSeat > 60 && trainSeat < 102) {
            System.out.println(" В вагоне есть стоячие места  ");
        } else {
            System.out.println("Нет мест ");
        }
        //task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (two > one  &&  one < three)
            System.out.println("Это число больше  " + three);
         else if (two > one && two < three) {
            System.out.println(" Это число самое большое " + one );
        }  else if (three > two && three > one) {
            System.out.println(" Это число самое большое " + two);
        } else {
            System.out.println("Никакое из чисел не подходит");
        }
    }
}