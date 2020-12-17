import java.util.Scanner;

//7. Даны действительные числа a1, a2, ..., an.
//Найти max(a1 + a2n, a2 + a2n−1, ..., an + an+1.

public class Task7 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        double[] a = new double[console.nextInt()];
        System.out.println("array a");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = Math.random() * 20 - 10;
            System.out.print(a[i] + " ");
        }
        double max = a[0] + a[a.length - 1];
        int ind1 = 0;
        int ind2 = a.length - 1;
        for (int i = 1; i <= Math.ceil((a.length - 2)/2.); i++) {
            if (max < a[i] + a[a.length - 1 - i]) {
                max = a[a.length - 1 - i] + a[i];
                ind1 = i;
                ind2 = a.length - 1 - i;
            }
        }
        System.out.print("\nmax : a[" + ind1 + "] + a[" + ind2 + "] = " + max);
    }
}
