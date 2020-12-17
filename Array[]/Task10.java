import java.util.Scanner;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task10 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        int[] a = new int[console.nextInt()];
        System.out.println("array a");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = (int) (Math.random() * 20 - 10);
            System.out.print(a[i] + " ");
        }
        for (int i = 1; i < a.length; i += 2) {
            a[i] = 0;
        }
        System.out.println("\nnew array a: ");
        for (int elem : a) {
            System.out.print(elem + " ");
        }
    }
}
