//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int a = 2147483647;
        System.out.println("Значение переменной с типом " +  "int  "  +   " равно  " + a);
        byte b = 127 ;
        System.out.println("Значение переменной с типом " +  "byte  " +  " равно  " + b );
        short c = 32762;
        System.out.println("Значение переменной с типом " +  "short  " +  " равно  "  + c);
        long d =  (long) 9223372036854775807L;
        System.out.println("Значение переменной с типом " +  "long  " +  " равно  "  + d);
        float e = 3.4E+38F;
        System.out.println("Значение переменной с типом " +  "float  " +  " равно  " + e);
        double f = 1.7E+308;
        System.out.println("Значение переменной с типом " +  "double  " +  " равно  " + f);
        char o = (char) Integer.MAX_VALUE;
        System.out.println("Значение переменной с типом " +  "char  " +  " равно  " + o );
        boolean i = false;
        System.out.println("Значение переменной с типом " +  "boolean  "+   " равно  " + i);
        //task 2
        double  doubllle = 27.12F;
        System.out.println("Переменная типа double " );
        long longEr = 987678965549L;
        System.out.println("Переменная типа  long ");
        float floatTer= 27.86F;
        System.out.println("Переменная типа float " );
        int  integer = 569;
        System.out.println("Переменная типа int");
        short shorty = -159;
        System.out.println("Переменная типа short");
        char charat = 27897;
        System.out.println("Переменная типа char");
        byte byter = 67;
        System.out.println("Переменная типа byte");
        //task 3
        int ludmila = 23;
        System.out.println( " Учеников у Людмилы Павловны  " + ludmila);
        int anna =  27;
        System.out.println("Учеников у Анны Сергеевны " + anna);
        int katrine =  30;
        System.out.println("Учеников у Екатерины Андреевны " + katrine);
        int allPaper  = 480;
        System.out.println("Всего бумаги было закуплено на учеников " + allPaper);
        int allStudents = ludmila + anna + katrine;
        System.out.println("Всего учеников  " + allStudents);
        int paperStudents = allPaper / allStudents ;
        System.out.println("Бумаги на каждого ученика " + paperStudents);
        //task 4
        int mashine1 = 16;
        System.out.println("За 2 минуты машина произвела " + mashine1 + " бутылок");
        int mashine2 = 16 * 10;
        System.out.println("За 20 минут машина произвела " + mashine2 + " бутылок");
        int mashine3 = 720 * 16;
        System.out.println("За сутки машина произвела " + mashine3 + " бутылок");
        int mashine4 = 2160 * 16;
        System.out.println(" За 3 дня машина произвела " + mashine4 + " бутылок");
        int mashine5 = 22320 * 16;
        System.out.println(" За месяц машина произвела " + mashine5 + " бутылок");
        //task 5
        int dye = 120;
        System.out.println("Всего краски  " + dye);
        int room = dye / 6;
        System.out.println("Всего классов в школе  " + room);
        int brownDye = room * 4;
        System.out.println("Коричневой краски было куплено " + brownDye);
        int whiteDye = room * 2;
        System.out.println("Белой краски было куплено  " + whiteDye );
        System.out.println("В школе где,  " + room + " классов, нужно  " + whiteDye + " банок белой краски и " +  brownDye + "  банок коричневой краски");
        //task 6
        short banana =  80 * 5;
        System.out.println("Кол-во граммов в 5 бананах  " + banana);
        int milk = 200 * 110;
        System.out.println("Кол-во граммов в 200мл молока " + milk);
        int iceCream = 200 / 100 * 105;
        System.out.println("Кол-во граммов в 2 брикетах " + iceCream);
        int eggs = 4 * 7;
        System.out.println("Кол-во граммов в 4 яйцах " + eggs);
        int allGram = banana + milk + iceCream + eggs;
        System.out.println("Вес в граммах  " + allGram);
        float killoGrams = (float) (allGram / 1000.0);
        System.out.println("Вес завтрака в килограммах  " + killoGrams);
        //task 7
        int startWeight = 7;
        int minWeight = 250;
        int maxWeight = 500;
        int startGram = (int) (startWeight * 1000.0);
        System.out.println(startGram);
        int minGram = minWeight / startWeight;
        int maxGram =  maxWeight / startWeight  ;
        int midleDays = (minGram + maxGram) / 2;
        System.out.println("Если спортсмен будет худеть каждый день на 250 грамм " + minGram);
        System.out.println("Если спортсмен будет худеть каждый день на 500 грамм  "  + maxGram);
        System.out.println("Если в среднем " + midleDays);
        //task 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaPlus = masha / 100 * 10;
        int denisPlus = denis / 100 * 10;
        int kristinaPlus = kristina / 100 * 10;
        int masha1 = masha + mashaPlus;
        int denis1 = denis + denisPlus;
        int kristina1 = kristina + kristinaPlus;
        int mashaYear = mashaPlus * 12;
        int denisYear = denisPlus * 12;
        int kristinaYear = kristinaPlus * 12;
        System.out.println("Маша теперь получает " + masha1 + " рублей, годовой доход вырос на " + mashaYear + " рублей");
        System.out.println("Денис теперь получает " + denis1 + " рублей, годовой доход вырос на " + denisYear + " рублей");
        System.out.println("Кристина теперь получает " + kristina1 + " рублей, годовой доход вырос на " + kristinaYear + " рублей");


    }
}