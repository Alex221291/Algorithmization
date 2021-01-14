import java.util.Scanner;
//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task6 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter equals a b c (a>=1, b>=1, c>=1) :");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        mutuallySimple(a, b, c);
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
    public static void mutuallySimple(int a, int b, int c)
    {
        if (NOD(NOD(a, b), c) == 1){
            System.out.println("Numbers are mutually prime");
        } else {
            System.out.println("Numbers are not mutually prime");
        }
    }
}
