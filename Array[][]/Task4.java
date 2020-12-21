import java.util.Scanner;

//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A[n, n] (n % 2 = 0): ");
        int n = console.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = j + 1;
                }
            }
            else {
                for (int j = 0; j < n; j++) {
                    a[i][j] = n - j;
                }
            }
        }
        System.out.println("array A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j ++) {
                    System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
