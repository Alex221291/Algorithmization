import java.util.Scanner;

//8. Дана последовательность целых чисел a1, a2, ..., an.
// Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ..., an).

public class Task8 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        int[] a = new int[console.nextInt()];
        System.out.println("array a");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = (int) (Math.random() * 20 - 10);
            System.out.print(a[i] + " ");
        }
        int minValue = minArray(a);
        int[] b = new int[a.length - minQuantityArray(a, minValue)];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (minValue != a[i]) {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println("\narray b");
        for (int i = 0; i <= b.length - 1; i++) {
            System.out.print(b[i] + " ");
        }
    }
    public static int minArray(int[] a)
    {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
    public static int minQuantityArray(int[] a, int min)
    {
        int minQuant = 0;
        for (int i = 1; i < a.length; i++) {
            if (min == a[i]) {
                minQuant++;
            }
        }
        return minQuant;
    }
}
