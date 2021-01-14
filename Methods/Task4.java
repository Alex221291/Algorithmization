import java.util.Scanner;
//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class Task4 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number of points n: ");
        int n = console.nextInt();
        int[][] p = new int[n][2];
        System.out.println("points");
        for (int i = 0; i < n; i++) {
            System.out.print("P" + (i+1) + " : ");
            for (int j = 0; j < p[0].length; j++) {
                p[i][j] = (int)(Math.random() * 200) - 100;
                System.out.print(p[i][j] + "   ");
            }
            System.out.println();
        }
        maxDistance(p);
    }
    public static void maxDistance(int [][]p)
    {
        double [][]d = new double[p.length][p.length];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                d[i][j] = Math.sqrt(Math.pow(p[i][0] - p[j][0], 2) + Math.pow(p[i][1] - p[j][1], 2));
            }
        }
        double maxD = d[0][0];
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                if (maxD < d[i][j]) {
                    maxD = d[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("\nmaximum distance between points P" + (indexI+1) + "(" + p[indexI][0] + ", " + p[indexI][1] + ") and P" + (indexJ+1) + "(" + p[indexJ][0] + ", " + p[indexJ][1] + ") : " + maxD);
    }
}
