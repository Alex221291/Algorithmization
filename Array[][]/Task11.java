import java.util.Scanner;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class Task11 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 10;
        int m = 20;
        int[][] a = new int[n][m];
        System.out.println("matrix A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 16);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int[] quant5 = new int[n];
        System.out.println("line numbers where the number 5 occurs three or more times");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 5) {
                    quant5[i]++;
                }
            }
            if (quant5[i] >= 3){
                System.out.print(i + " ");
            }
        }
    }
}
