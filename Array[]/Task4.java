import java.util.Scanner;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        double[] a = new double[console.nextInt()];
        System.out.println("array a");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] =  Math.random() * 2000 - 1000;
            System.out.print(a[i] + " ");
        }
        double maxAI = a[0];
        int maxI = 0;
        double minAI = a[0];
        int minI = 0;
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] < maxAI) {
                maxAI = a[i];
                maxI = i;
            }
            if (a[i] > minAI) {
                minAI = a[i];
                minI = i;
            }
        }
        double rev = a[minI];
        a[minI] = a[maxI];
        a[maxI] = rev;
        System.out.println("\nnew array a");
        for (double m : a) {
            System.out.print(m + " ");
        }
    }
}
