import java.util.Scanner;
//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.

public class Tas13 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter equals n (n => 2):");
        int n = console.nextInt();
        numberTwins(n);
    }
    public static void numberTwins(int n)
    {
        System.out.println("the number of twins in the interval [" + n + ", " + (2 * n) + "]");
        for (int i = n; i <= 2 * n - 2; i++) {
            System.out.println(i + "  " + (i + 2));
        }
    }
}
