import sun.security.util.ArrayUtil;
import java.util.Scanner;
import  java.util.Arrays;
//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
//при этом не используя дополнительный массив.

public class Task1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A[n]");
        int n = console.nextInt();
        System.out.println("Enter length array B[m]");
        int m = console.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
                    a[i] = (int) (Math.random() * 200 - 100);
            }
        int[] b = new int[m];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 200 - 100);
        }
        System.out.println("enter the index to insert K");
        int k = console.nextInt();
        System.out.println("array A");
        printArray(a);
        System.out.println("array B");
        printArray(b);
        String aAndB = "";
        for (int i = 0; i <= k; i++) {
            aAndB += a[i] + " ";
        }
        for (int i = 0; i < b.length; i++) {
            aAndB += b[i] + " ";
        }
        for (int i = k + 1; i < a.length; i++) {
            aAndB += a[i] + " ";
        }
        System.out.println("new array A");
        a = new int[n + m];
         a = Arrays.stream(aAndB.split(" ")).mapToInt(Integer::parseInt).toArray();
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
