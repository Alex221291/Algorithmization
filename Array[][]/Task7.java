import java.util.Scanner;

//7. Сформировать квадратную матрицу порядка N по правилу:
// и подсчитать количество положительных элементов в ней.

public class Task7 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A[n, n] (n % 2 = 0): ");
        int n = console.nextInt();
        double[][] a = new double[n][n];
        int quantPositiveElem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                a[i][j] = Math.sin((double) (i * i - j * j) / n);
                if (a[i][j] > 0) {
                    quantPositiveElem++;
                }
            }
        }
        System.out.println("matrix A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j ++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Quantity positive elements " + quantPositiveElem);
    }
}
