import java.util.Scanner;
//8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.

public class Tas8 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        int []a = new int[console.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 200 - 100);
        }
        System.out.println("array A");
        printArray(a);
        System.out.println("enter the interval [k, m]");
        int k = console.nextInt();
        int m = console.nextInt();
        System.out.println("output by three element: ");
        outputByThree(a, k, m);
    }
    public static void outputByThree(int []a, int k, int m)
    {
        if (m - k >= 2) {
            for (int i = k; i <= m - 2; i++) {
                System.out.println(a[i] + "  " + a[i+1] + "  " + a[i+2]);
            }
        }
        else {
            System.out.println("not found");
        }
    }
    public static void printArray(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
}
