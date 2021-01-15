import java.util.Scanner;
//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.

public class Task10 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter equals n (n => 1):");
        int n = console.nextInt();
        System.out.println("array of number: ");
        printArray(numberArray(n));
    }
    public static char[] numberArray(int n)
    {
        char []t = ((String) "" + n).toCharArray();
        return t;
    }
    public static void printArray (char [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
}
