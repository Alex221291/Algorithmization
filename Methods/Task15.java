import java.util.Scanner;
//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Task15 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("enter the order of the number n (n => 2):");
        int n = console.nextInt();
        System.out.println("numbers with digits in ascending order:");
        numberIncreasingSequense(n);
    }
    public static boolean increasingSequence(int number) {
        char []t = ((String) "" + number).toCharArray();
        int []masNumber = new int[t.length];
        for (int i = 0; i < masNumber.length; i++) {
            masNumber[i] = t[i] - '0';
        }
        int count = 0;
        for (int i = 0; i < masNumber.length - 1; i++) {
            if (masNumber[i] >= masNumber[i + 1]) {
                count++;
            }
        }
        return count == 0;
    }
    public static void numberIncreasingSequense(int n)
    {
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (increasingSequence(i)) {
                System.out.print(i + "  ");
            }
        }
    }
}
