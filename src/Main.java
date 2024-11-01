//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int salary = 15000;
        int total = 0;
        int day = 0;
        while (total < 2_495_000) {
            total = total + salary;
            day++;
            if (total % 5 == 0) {
            }
            System.out.println("день " + day + " Того " + total);
        }
        //task2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }


        System.out.println();


        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
            //task 3
            int population = 12_000_000;
            int birthRate = 17;
            int death = 8;
            int yearNow = 2024;
            for (int years = yearNow; years < yearNow + 10; years++) {
                population += population * birthRate / 1000 - population * death / 1000;
                System.out.println("Год " + years + " численность населения " + population);
                //task 4
                int initialDeposit = 15000;
                int targetAmount = 12000000;
                double monthlyInterestRate = 0.07;
                int months = 0;
                double currentAmount = initialDeposit;
                while (currentAmount < targetAmount) {
                    months++;
                    currentAmount += currentAmount * monthlyInterestRate;
                    if (months % 6 == 0) {
                        System.out.println("Месяц " + months + "  рублей " + currentAmount);
                    }
                }
                System.out.println("Василию потребуется " + months + " месяцев, чтобы накопить 12 миллионов рублей");
                //task 6
                int initialAmount = 15000;
                double monthlyRate = 0.07;
                int totalMonths = 9 * 12;
                int periodMonths = 6;

                double currentDeposit = initialAmount;

                for (int month = 1; month <= totalMonths; month++) {

                    currentDeposit += currentDeposit * monthlyRate;


                    if (month % periodMonths == 0) {
                        int yearss = month / 12;
                        int months1 = month % 12;
                        System.out.printf(" Через " + yearss + " лет " + months1 + " месяцев рублей " + currentDeposit);
                        //task 7
                        int friday = 1;
                        while (friday <= 31) {
                            System.out.println("Сегодня пятница, " + friday + " -е число.Необходимо подготовить отчет");
                            friday += 7;
                            //task 8
                            int startYear = 2024 - 200;
                            int endYear = 2024 + 100;
                            int cometPeriod = 79;

                            System.out.println("Годы, когда комета пролетала над Землей за последние 200 лет и в ближайшие 100 лет:");

                            for (int year = startYear; year <= endYear; year++) {
                                if (year % cometPeriod == 0) {
                                    System.out.println(year);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}