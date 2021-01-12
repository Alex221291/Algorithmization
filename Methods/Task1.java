import java.util.Scanner;
//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел.

public class Task1 {

    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter equals a b (a>=1, b>=1) :");
        int a = console.nextInt();
        int b = console.nextInt();
        System.out.println("NOD(" + a + ", " + b + ") = " + NOD(a, b));
        System.out.println("NOK(" + a + ", " + b + ") = " + NOK(a, b));
    }
    public static int NOD(int a, int b)
    {
        do {
            if (a != b) {
                if (a > b) {
                    a -= b;
                }
                else {
                    b -= a;
                }
            }
        } while (a != b);
            return a;
    }
    public static int NOK(int a, int b)
    {
        return a * b / NOD(a, b);
    }
}
