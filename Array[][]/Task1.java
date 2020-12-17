import java.util.Scanner;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A[n, m]: ");
        int n = console.nextInt();
        int m = console.nextInt();
        double[][] a = new double[n][m];
        System.out.println("array a");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = Math.random() * 200 - 100;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nodd columns whose first element is larger than the last:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j += 2) {
                if (a[0][j] > a[n - 1][j]) {
                    System.out.print(a[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
