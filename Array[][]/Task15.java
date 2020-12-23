import java.util.Scanner;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length matrix A[m,n]");
        int n = console.nextInt();
        int m = console.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                    a[i][j] = (int) (Math.random() * 200 - 100);
            }
        }
        System.out.println("matrix A");
        printArray(a);
        int max = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Maximum element of matrix: " + max);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j] % 2 != 0) {
                    a[i][j] = max;
                }
            }
        }
        System.out.println("matrix A (odd elements are equal to the maximum)");
        printArray(a);
    }
    public static void printArray (int [][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
