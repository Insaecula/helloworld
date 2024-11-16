 import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
 //click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        printIsLeapYear(2024);
        appLicationVersion(0, 2016);
        calculateDeliveryDays(25);
    }

    public static void printIsLeapYear(int year) {
        boolean yearIsleap = isLeap(year);
        printIsLeapYearResult(year, yearIsleap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный");

        } else {
            System.out.println(year + " не високосный");
        }


    }

    public  static void appLicationVersion (int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.println("Установите");
        if (deviceIsOld) {
            System.out.println("lite");
        }
        System.out.println("Версию для");
        if (clientOS == 0) {
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }
    }
    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

     private static int calculateDeliveryDays(int deliveryDistance) {
         int result = 1;

         if(deliveryDistance > 20) {
             result++;
             System.out.println("Потребуется дней "  + result);
         }
         if (deliveryDistance > 60) {
             result++;
             System.out.println("Потребуется дней "  + + result);
         }
         if (deliveryDistance > 100) {
             result = - 1;
             System.out.println("Потребуется дней "  + + result);
         }
         return  result;
     }
 }

