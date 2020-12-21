import java.util.Scanner;

//10. Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length matrix A[n]: ");
        int n = console.nextInt();
        int[][] a = new int[n][n];
        System.out.println("matrix A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 200 - 100);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("positive elements of the main diagonal matrix ");
        for (int i = 0; i < n; i++) {
                if (a[i][i] > 0) {
                    System.out.print(a[i][i] + " ");
                }
        }
    }
}
