import java.util.Scanner;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них. 

public class Task9 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        int[] a = new int[console.nextInt()];
        System.out.println("array a");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = (int) (Math.random() * 20 - 10);
            System.out.print(a[i] + " ");
        }
        int[] quantRepetElem = new int[a.length];
        for (int i = 0; i < quantRepetElem.length; i++) {
            quantRepetElem[i] = quantityRepetitionsElementsInArray(a,a[i]);
        }
        int[] equQuantRepetElem = new int[quantityRepetitionsElementsInArray(quantRepetElem, maxArray(quantRepetElem))];
        for (int i = 0, j = 0; i < quantRepetElem.length; i++) {
            if (maxArray(quantRepetElem) == quantRepetElem[i]) {
                equQuantRepetElem[j] = a[i];
                j++;
            }
        }
        System.out.println("\nmost repeated minimum number: " + minArray(equQuantRepetElem));
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
    public static int maxArray(int[] a)
    {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
    public static int quantityRepetitionsElementsInArray(int[] a, int Elem)
    {
        int qre = 0;
        for (int i = 0; i < a.length; i++) {
            if (Elem == a[i]) {
                qre++;
            }
        }
        return qre;
    }
}
