import java.util.Scanner;
//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел/

public class Task2 {

    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter equals a b c d (a>=1, b>=1, c>=1, d >=1) :");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        int d = console.nextInt();
       System.out.println("NOD(" + a + ", " + b + ", " + c + ", " + d + ") = " + NOD4(a, b, c, d));
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
    public static int NOD4(int a, int b, int c, int d)
    {
        return NOD(NOD(NOD(a, b), c), d);
    }
}
