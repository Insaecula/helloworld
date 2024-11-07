import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//task1
        int[] numbers = new int[]{1, 2, 3};
        double[] fractions = {1.57, 7.654, 9.986};
        int[] myint = new int[]{91, 95, 105};
        //task2
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != myint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);
            if (i != fractions.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println();
        for (int i = 0; i < myint.length; i++) {
            System.out.print(myint[i]);
            if (i != myint.length - 1) {
                System.out.print(" ,");
            }
        }

        System.out.println();
        //task3
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = fractions.length - 1; i >= 0; i--) {
            System.out.print(fractions[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //task4
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

