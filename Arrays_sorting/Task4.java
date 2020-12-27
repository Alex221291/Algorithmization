import sun.security.util.ArrayUtil;
import java.util.Scanner;
import  java.util.Arrays;
//4. Сортировка обменами. Дана последовательность чисел a1, a2, ..., an.
// Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. 
// Если ai > ai+1, то делается перестановка.
// Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class Task4 {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 200) - 100;
        }
        System.out.println("array A");
        printArray(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    int rev = a[j];
                    a[j] = a[j+1];
                    a[j+1] = rev;
                    count++;
                }
            }
        }
        System.out.println("sort in descending order array A");
        printArray(a);
        System.out.println("number of permutations: " + count);
    }
    public static void printArray (int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
}
