import java.util.Scanner;
//5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).

public class Task5 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        double []a = new double[console.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 200 - 100;
        }
        System.out.println("array A");
        printArray(a);
        System.out.println("\nSecond maximum element: " + secondMax(a));
    }
    public static double secondMax(double []a)
    {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] < a[i]) {
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
        return a[1];
    }
    public static void printArray(double [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
}
