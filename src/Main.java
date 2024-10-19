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
                double  doubllle = 2.786;//3
                System.out.println("Переменная типа double " );
                long longEr = 987678965549L;
                System.out.println("Переменная типа  long ");
                float floatTer= 27.12F;
                System.out.println("Переменная типа float " );
                char  charat = 569;
                System.out.println("Переменная типа char");
                short shorty = -159;
                System.out.println("Переменная типа short");
                int integer = 27897;
                System.out.println("Переменная типа int");
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
        int Min2 = 16;
        int Min20 = Min2 * 16;
        int hours24 = Min20 * 3 * 24;
        int days3 = hours24 * 3;
        int month = hours24 * 30;;
        System.out.println("За 20 минут машина сделала  " + Min20 + " штук");
        System.out.println("За сутки машина сделала " + hours24 + " штук ");
        System.out.println("За три дня машина сделала " + days3 + " штук");
        System.out.println("За месяц машина сделала " + month + " штук ");
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
                short banana =  5 * 80;
                System.out.println("Кол-во граммов в 5 бананах  " + banana);
                int milk = 2 * 105;
                System.out.println("Кол-во граммов в 200мл молока " + milk);
                int iceCream = 2 * 100;
                System.out.println("Кол-во граммов в 2 брикетах " + iceCream);
                int eggs = 4 * 70;
                System.out.println("Кол-во граммов в 4 яйцах " + eggs);
                int allGram = banana + milk + iceCream + eggs;
                System.out.println("Вес в граммах  " + allGram);
                float killoGrams = (float) (allGram / 1000.0);
                System.out.println("Вес завтрака в килограммах  " + killoGrams);
                //task 7
                int startWeight = 7;
                int minWeight = 250;
                int maxWeight = 500;
                double startGram =  startWeight * 1000;
                System.out.println("Вес в граммах  " + startGram);
                double minGram = startGram / minWeight ;
                double  maxGram =  startGram / maxWeight;
               double   midleDays =  minGram + maxGram / 2;
                System.out.println("Если спортсмен будет худеть каждый день на 250 грамм " + minGram);
                System.out.println("Если спортсмен будет худеть каждый день на 500 грамм  "  + maxGram);
                System.out.println("Если в среднем " + midleDays);
                //task 8
                int masha = 67760;
                int denis = 83690;
                int kristina = 76230;
                int mashaUp = masha / 100 * 10;
                int denisUp = denis / 100 * 10;
                int kristinaUp = kristina / 100 * 10;
                int mashaNew = masha + mashaUp;
                int denisNew = denis + denisUp;
                int kristinaNew = kristina + kristinaUp;
                int mashaYear = mashaUp * 12;
                int denisYear = denisUp * 12;
                int kristinaYear = kristinaUp * 12;
                System.out.println("Маша теперь получает " + mashaNew + " рублей, годовой доход вырос на " + mashaYear + " рублей");
                System.out.println("Денис теперь получает " + denisNew + " рублей, годовой доход вырос на " + denisYear + " рублей");
                System.out.println("Кристина теперь получает " + kristinaNew + " рублей, годовой доход вырос на " + kristinaYear + " рублей");
            }
        }
