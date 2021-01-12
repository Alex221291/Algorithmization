import sun.security.util.ArrayUtil;
import java.util.Scanner;
import  java.util.Arrays;
//7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm
//в первую последовательность так, чтобы новая последовательность оставалась возрастающей.

public class Task7 {

    public static void main(String[] args)  {
        double[] a = new double[]{-5.4, -0.3, 7, 15.45, 21.5, 29, 38.9, 62.4, 100.001};
        double[] b = new double[]{-42.1, -13.6, 3.3, 18.1, 33.3, 56.8, 200.002};
        System.out.println("array A");
        printArray(a);
        System.out.println("array B");
        printArray(b);
        double []c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i] = b[i];
        }
        for (int i = 1; i < c.length; i++) {
            if (c[i - 1] > c[i]) {
                double buf = c[i];
                c[i] = c[i - 1];
                c[i - 1] = buf;
                if (i > 1){
                    i -= 2;
                }
                else {
                    i--;
                }

            }
        }
        System.out.println("places to insert elements:");
        for (int i = 0, j = 0; i < c.length; i++) {
            if (c[i] == b[j]) {
                if (i == 0) {
                    System.out.println(b[j] + " before " + c[i+1]);
                }
                else {
                    if (i == c.length - 1) {
                        System.out.println(b[j] + " after " + c[i-1]);
                    }
                    else {
                        System.out.println(b[j] + " after " + c[i-1] + " and before " + c[i+1]);
                    }
                }
                j++;
            }
        }

    }
    public static void printArray (double [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
}
