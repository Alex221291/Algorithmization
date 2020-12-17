import java.util.Scanner;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A[n, n]: ");
        int n = console.nextInt();
        double[][] a = new double[n][n];
        System.out.println("array a");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.random() * 200 - 100;
                System.out.printf("%.2f   ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nodd columns whose first element is larger than the last:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j ++) {
                if ((i == j) || (i + j == n - 1)) {
                    System.out.printf("%.2f   ", a[i][j]);
                } else {
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
    }
}
