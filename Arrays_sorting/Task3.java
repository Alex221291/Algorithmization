import sun.security.util.ArrayUtil;
import java.util.Scanner;
import  java.util.Arrays;
//3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.
// Требуется переставить элементы так, чтобы они были расположены по убыванию. 
// Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. 
// Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.

public class Task3 {

    public static void main(String[] args) {
        int[] a = {-23, -5, 2, 2, 25, 73, 99, 100, 203};
        System.out.println("array A");
        printArray(a);
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int rev = a[i];
                    a[i] = a[j];
                    a[j] = rev;
                }
            }
        }
        System.out.println("sort in descending order array A");
        printArray(a);
    }
    public static void printArray (int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
}
