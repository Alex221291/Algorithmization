import java.util.Scanner;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task6 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A[n, n] (n % 2 = 0): ");
        int n = console.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if (((i >= j) && (j >= n - 1 - i)) || ((i <= j) && (j <= n - 1 - i)) ) {
                    a[i][j] = 1;
                }
                else {
                    a[i][j] = 0;
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
    }
}
