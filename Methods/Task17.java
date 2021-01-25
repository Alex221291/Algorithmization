import java.util.Scanner;
//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task17 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("enter equals n (n => 1):");
        int n = console.nextInt();
        System.out.println("the number of subtractions: " + numberOfSubtractions(n));
    }
    public static int sumDigits(int n) {
        char []t = ((String) "" + n).toCharArray();
        int []masNumber = new int[t.length];
        for (int i = 0; i < masNumber.length; i++) {
            masNumber[i] = t[i] - '0';
        }
        int sum = 0;
        for (int i = 0; i < masNumber.length; i++) {
            sum += masNumber[i];
        }
        return sum;
    }
    public static int numberOfSubtractions(int n)
    {
        int sumDig = sumDigits(n);
        int nOfSub = 0;
        if (n % sumDig == 0) {
            nOfSub = n / sumDig;
        }
        else {
            nOfSub = (n / sumDig) + 1;
        }
        return nOfSub;
    }
}
