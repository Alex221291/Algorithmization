import java.util.Scanner;
//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task16 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("enter the order of the number n (n => 1):");
        int n = console.nextInt();
        System.out.println("sum of numbers with odd digits: " + sumNumberOfOddDigits(n));
        System.out.println("number of even digits: " + evenDigits(sumNumberOfOddDigits(n)));
    }
    public static boolean oddDigits(int number) {
        char []t = ((String) "" + number).toCharArray();
        int []masNumber = new int[t.length];
        for (int i = 0; i < masNumber.length; i++) {
            masNumber[i] = t[i] - '0';
        }
        int count = 0;
        for (int i = 0; i < masNumber.length; i++) {
            if ((masNumber[i] % 2) != 0) {
                count++;
            }
        }
        return count == masNumber.length;
    }
    public static int evenDigits(int number) {
        char []t = ((String) "" + number).toCharArray();
        int []masNumber = new int[t.length];
        for (int i = 0; i < masNumber.length; i++) {
            masNumber[i] = t[i] - '0';
        }
        int count = 0;
        for (int i = 0; i < masNumber.length; i++) {
            if ((masNumber[i] % 2) == 0) {
                count++;
            }
        }
        return count;
    }
    public static int sumNumberOfOddDigits(int n)
    {
        int sum = 0;
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (oddDigits(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
