import java.util.Scanner;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        int[] a = new int[console.nextInt()];
        System.out.println("Enter K: ");
        int K = console.nextInt();
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = (int) (Math.random() * 1000 + 1);
            System.out.print(a[i] + " ");
        }
        System.out.println("\nthe number is a multiple of " + K);
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] % K == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
