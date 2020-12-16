import java.util.Scanner;

//3. Дан массив действительных чисел, размерность которого N.
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        double[] a = new double[console.nextInt()];
        int zeroQuantity= 0;
        int plusQuantity = 0;
        int minusQuantity = 0;
        System.out.println("array a");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] =  Math.random() * 2000 - 1000;
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > 0) {
                plusQuantity++;
            }
            else {
                if(a[i] == 0) {
                    zeroQuantity++;
                }
                else {
                    minusQuantity++;
                }
            }
        }
        System.out.println("\nquantity of negative numbers: " + minusQuantity);
        System.out.println("quantity of zero numbers: " + zeroQuantity);
        System.out.println("quantity of positive numbers: " + plusQuantity);
    }
}
