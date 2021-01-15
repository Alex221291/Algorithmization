import java.util.Scanner;
//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task11 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter equals a b (all => 1):");
        int a = console.nextInt();
        int b = console.nextInt();
        moreNumber(a, b);
    }
    public static char[] numberArray(int n)
    {
        char []t = ((String) "" + n).toCharArray();
        return t;
    }
    public static void moreNumber(int a, int b)
    {
        if (numberArray(a).length > numberArray(b).length){
            System.out.println("more numbers: " + a);
        }
        else {
            if (numberArray(a).length < numberArray(b).length) {
                System.out.println("more numbers:" + b);
            }
            else {
                System.out.println("the same number of digits");
            }
        }
    }
}
