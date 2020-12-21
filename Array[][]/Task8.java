import java.util.Scanner;

//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый.
// Номера столбцов вводит пользователь с клавиатуры.

public class Task8 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length matrix A[n, m]: ");
        int n = console.nextInt();
        int m = console.nextInt();
        int[][] a = new int[n][m];
        System.out.println("matrix A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 200 - 100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("enter the column numbers to exchange k and l");
        int k = console.nextInt();
        int l = console.nextInt();
        int rep;
        for (int i = 0; i < n; i++) {
            rep = a[i][k];
            a[i][k] = a[i][l];
            a[i][l] = rep;
        }
        System.out.println("new matrix A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j ++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
