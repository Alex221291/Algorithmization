import java.util.Scanner;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A[n, m]: ");
        int n = console.nextInt();
        int m = console.nextInt();
        double[][] a = new double[n][m];
        System.out.println("matrix a");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = Math.random() * 200 - 100;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the line number");
        int k = console.nextInt();
        System.out.println(k + " line");
        for (int j = 0; j < m; j++) {
            System.out.print(a[k][j] + " ");
        }
        System.out.println("\nEnter the column number");
        int p = console.nextInt();
        System.out.println(p + " column");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i][p]);
        }
    }
}
