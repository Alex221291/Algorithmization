import java.util.Scanner;
//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

public class Task12 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter equals k n (all => 1):");
        int k = console.nextInt();
        int n = console.nextInt();
        if (numberMas(k, n)[0] != 0) {
            System.out.println("Numbers whose sum of digits is equal to " + k + " and less " + n);
            printArray(numberMas(k, n));
        }
        else {
            System.out.println("No such numbers were found");
        }
    }
    public static int sumNumber(int num)
    {
        char []t = ((String) "" + num).toCharArray();
        int sNum = 0;
        for (int i = 0; i < t.length; i++) {
            sNum += t[i] - '0';
        }
        return sNum;
    }
    public static int[] numberMas(int k, int n)
    {
        int lenMas = 0;
        for (int i = 1; i <= n; i++) {
            if (sumNumber(i) == k) {
                lenMas ++;
            }
        }
        int []nMas;
        if (lenMas != 0) {
            nMas = new int[lenMas];
            for (int i = 1, j = 0; i <= n; i++) {
                if (sumNumber(i) == k) {
                    nMas[j] = i;
                    j ++;
                }
            }
        }
        else {
            nMas = new int[1];
        }

        return nMas;
    }
    public static void printArray (int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
}
