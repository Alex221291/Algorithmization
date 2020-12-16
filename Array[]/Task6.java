import java.util.Scanner;

//6. Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class Task6 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        double[] a = new double[console.nextInt()];
        double sum = 0;
        System.out.println("array a");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = Math.random() * 20 - 10;
            System.out.print(a[i] + " ");
        }
        for (int i = 2; i <= a.length - 1; i++) {
            int count = 0;
            for (int j = 0; j <= (int) Math.sqrt(i); j++) {
                if (a[i] % j == 0) {
                    count++;
                }
            } if (count == 0) {
                sum += a[i];
            } 
        }
        System.out.print("\nsum = " + sum);
    }
}
