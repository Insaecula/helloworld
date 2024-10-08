//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0; //task1
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4; //task2
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5; //task3
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19; //task4
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5; //task5
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var fighterWeight1 = 78.2; //task 6
        System.out.println(fighterWeight1);
        var fighterWeight2 = 82.7;
        System.out.println(fighterWeight2);
        var fightersWeight = fighterWeight1 + fighterWeight2;
        System.out.println("Вес двух бойцов  "   +  fightersWeight  + "кг") ;
        var differenceWight = fighterWeight2 - fighterWeight1;
        System.out.println("Разница в весе между двумя бойцами  "  + differenceWight + "кг");
        var divisionWight = fighterWeight1 / fighterWeight2;
        System.out.println("Деление  веса двух бойцов  " + divisionWight + "кг");
        //task 7
        var remainderWeight =  (fighterWeight2 % fighterWeight1) / divisionWight  ;
        System.out.println("Остаток деления двух весов бойцов  " + remainderWeight +  "кг");
        var allHours = 640; //task8
        var oneEmployee = 8;
        var allWorkers = allHours / oneEmployee;
        System.out.println("Всего рабочих в компании  "  + allWorkers + "  работников");
        var newEmployee = allWorkers + 94;
        System.out.println(newEmployee);
        var moreEmployee = allHours / newEmployee;
        System.out.println("В компании работает  " + newEmployee + "  человек, то всем сотрудникам  " + moreEmployee +   "  часа работы поделено на всех сотрудников");
    }
}