import java.util.Scanner;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму.

public class Task9 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length matrix A[n, m]: ");
        int n = console.nextInt();
        int m = console.nextInt();
        int[][] a = new int[n][m];
        System.out.println("matrix A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int[] sumColumn = new int[m];
        int maxSumColumn = sumColumn[0];
        int indMaxSumColumn = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j ++) {
                sumColumn[j] += a[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            if (maxSumColumn < sumColumn[i]) {
                maxSumColumn = sumColumn[i];
                indMaxSumColumn = i;
            }
        }
        System.out.println("the amount in columns");
        for (int i = 0; i < m; i ++) {
            System.out.print(sumColumn[i] + " ");
        }
        System.out.println("\ncolumn with the maximum amount " + indMaxSumColumn + " : " + maxSumColumn);
    }
}
