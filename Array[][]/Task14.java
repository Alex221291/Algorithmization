import java.util.Scanner;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.

public class Task14 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length matrix A[m,n] (m >= n)");
        int m = console.nextInt();
        int n = console.nextInt();
        int[][] a = new int[m][n];
        int count;
        for (int j = 1; j < n; j++) {
            count = 0;
            for (int i = 0; i < m; i++) {
                if (count < j) {
                    a[i][j] = (int) (Math.random() * 2);
                    if (a[i][j] == 1) {
                        count++;
                    }
                    else {
                        if(m -1 - i + count < j) {
                            a[i][j] = 1;
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("matrix A");
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
