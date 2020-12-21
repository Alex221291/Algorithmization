import java.util.Scanner;

//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length matrix A[n, n] (n % 2 = 0): ");
        int n = console.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                a[i][j] = i + 1;
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
