import java.util.Scanner;
//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task {
    public static void main(String[] args)  {
        System.out.println("sum of factorials of all odd numbers from 1 to 9: "+ sumFact());
    }
    public static int fact(int n)
    {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static int sumFact()
    {
        int sF = 0;
        for (int i = 1; i <= 9; i+=2) {
            sF += fact(i);
        }
        return sF;
    }
}
