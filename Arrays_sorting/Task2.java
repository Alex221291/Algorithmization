import sun.security.util.ArrayUtil;
import java.util.Scanner;
import  java.util.Arrays;
//2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
// Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
// Примечание. Дополнительный массив не использовать.

public class Task2 {

    public static void main(String[] args) {
        int[] a = {-23, -5, 2, 2, 25, 73};
        int[] b = {-75, -13, 0, 17, 56, 100, 1000};
        System.out.println("array A");
        printArray(a);
        System.out.println("array B");
        printArray(b);
        String aAndB = "";
        for (int i = 0; i < a.length; i++) {
            aAndB += a[i] + " ";
        }
        for (int i = 0; i < b.length; i++) {
            aAndB += b[i] + " ";
        }
        System.out.println("new array A");
        a = new int[a.length + b.length];
        a = Arrays.stream(aAndB.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);
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
