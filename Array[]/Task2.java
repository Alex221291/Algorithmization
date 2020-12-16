import java.util.Scanner;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., аn.
// Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

public class Task2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        double[] a = new double[console.nextInt()];
        System.out.println("Enter Z: ");
        double Z = console.nextDouble();
        int count = 0;
        System.out.println("\narray a");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] =  Math.random() * 2000 - 1000;
            System.out.print(a[i] + " ");
        }
        System.out.println("\nnew array");
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > Z) {
                a[i] = Z;
                count++;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println("\nnumber of substitutions " + count);
    }
}
