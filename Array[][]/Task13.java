import java.util.Scanner;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length matrix A[n,m]");
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
        System.out.println("matrix columns sorted in ascending order");
        sortArrMinMax(a);
        printArray(a);
        System.out.println("matrix columns sorted in descending order");
        sortArrMaxMin(a);
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
    public static void sortArrMinMax(int[][] arr)
    {
        int buf;
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i][j] > arr[k][j]) {
                        buf = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = buf;
                    }
                }
            }
        }
    }
    public static void sortArrMaxMin(int[][] arr)
    {
        int buf;
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i][j] < arr[k][j]) {
                        buf = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = buf;
                    }
                }
            }
        }
    }
}
