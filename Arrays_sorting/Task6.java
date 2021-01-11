import sun.security.util.ArrayUtil;
import java.util.Scanner;
import  java.util.Arrays;
//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1.
//Если ai <= a(i+1), то продвигаются на один элемент вперед. Если ai > ai+1,
//то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.

public class Task6 {

    public static void main(String[] args)  {
        double[] a = new double[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 200 - 100;
        }
        System.out.println("array A");
        printArray(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                double buf = a[i];
                a[i] = a[i - 1];
                a[i - 1] = buf;
                if (i > 1){
                    i -= 2;
                }
                else {
                    i--;
                }

            }
        }
        System.out.println("sort in ascending order of the array A");
        printArray(a);
    }
    public static void printArray (double [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
}
