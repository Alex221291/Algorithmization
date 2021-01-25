import java.util.Scanner;
//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

public class Task14 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter equals k (k => 1):");
        int k = console.nextInt();
        numberArmstrong(k);
    }public static int sumNumber(int num)
    {
        char []t = ((String) "" + num).toCharArray();
        int sNum = 0;
        for (int i = 0; i < t.length; i++) {
            sNum += t[i] - '0';
        }
        return sNum;
    }
    public static int quantNumber(int num)
    {
        char []t = ((String) "" + num).toCharArray();
        return t.length;
    }
    public static void numberArmstrong(int k)
    {
        System.out.println("Armstrong numbers in the interval [1, " + k + "]");
        for (int i = 1; i <= k; i++) {
            if (Math.pow(sumNumber(i), quantNumber(i)) == i) {
                System.out.print(i + "  ");
            }
        }
    }
}
