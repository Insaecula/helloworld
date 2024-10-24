//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
        int os = 1;
        if (os < 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            //task 2
            int clientDeviceYear = 2015;
            boolean lastYearOs = clientDeviceYear < 2015;
            if (clientDeviceYear == 2015) {
                System.out.println("Установите приложение для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию для приложения Android по ссылке ");
            }
            //task 3
            int year = 2024;
            if (year % 4 == 0 && 100 != 0 || year % 400 == 0) {
                System.out.println("Год " + year + " високосный ");
            } else {
                System.out.println("Год " + year + " не високосный");
            }
            //task 4
            int deliveryDistance = 95;
            int days = 1;
            if (deliveryDistance < 20) {
                System.out.println("Доставка займет" + days);
            } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                System.out.println(" Доставка займет " + (days + 1) + " дня");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Доставка займет " + (days + 2) + " дня");
            } else {
                System.out.println(" Доставки нет ");
                //task 5
                int monthNumber = 12;
                switch (monthNumber) {
                    case 12:
                    case 2:
                    case 1:
                        System.out.println(" Пренадлежит к сезону зима" + monthNumber);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println(monthNumber + " пренадлежат к сезону весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println(monthNumber + " Пренадлежит к сезону лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println(monthNumber + " Пренадлежит к сезону осень");
                        break;
                    default:
                        System.out.println(" нету такого сезона");
                }
            }
        }
    }
}