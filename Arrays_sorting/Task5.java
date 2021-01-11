import sun.security.util.ArrayUtil;
import java.util.Scanner;
import  java.util.Arrays;
//5. Сортировка вставками. Дана последовательность чисел a1 ,a2 , ..., an.
//Требуется переставить числа в порядке возрастания. Делается это следующим образом. Пусть
//a1 ,a2 , ..., ai - упорядоченная последовательность, т. е. a1 <= a2 <= ...<= ai/
//Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class Task5 {

    public static void main(String[] args)  {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 200) - 100;
        }
        System.out.println("array A");
        printArray(a);
        for (int i = 1; i < a.length; i++) {
            int indKey = binSearch(a, i - 1, a[i]);
            if (indKey != i) {
                int bufKey = a[i];
                for (int j = i; j > indKey; j--) {
                    a[j] = a[j - 1];
                }
                a[indKey] = bufKey;
            }
        }
        System.out.println("sort in ascending order of the array A");
        printArray(a);
    }
    public static void printArray (int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
    public static int binSearch(int [] arr, int indR, int key)
    {
        int l = 0;
        int r = indR;
        if(r != 0) {
            while (l < r) {
                int m = (l + r) / 2;
                if (arr[m] < key) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }
            return r;
        }
        else {
            if(arr[0] > arr[1]) {
                return 0;
            }
            else {
                return 1;
            }
        }
    }

}
