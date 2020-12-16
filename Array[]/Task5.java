import java.util.Scanner;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        int[] a = new int[console.nextInt()];
        System.out.println("array a");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] =  (int) (Math.random() * 2000 - 1000);
            System.out.print(a[i] + " ");
        }
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] > i) {
                System.out.print("\na[" + i + "] = " + a[i]);
            }
        }
    }
}
