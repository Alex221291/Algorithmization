import sun.security.util.ArrayUtil;
import java.util.Scanner;
import  java.util.Arrays;
//8.Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные).
//Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.

public class Task8 {

    public static void main(String[] args)  {
        long[] p = new long[10];
        long[] q = new long[10];
        long denominator= 1;
        for (int i = 0; i < p.length; i++) {
            p[i] = (long) (Math.random() * 100) + 1;
            q[i] = (long) (Math.random() * 100) + 1;
            denominator *= q[i];
        }
        System.out.println("the original fractions");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + "/" + q[i] + "     ");
        }
        for (int i = 0; i < p.length; i++) {
            p[i] = p[i] * denominator / q[i];
            q[i] = denominator;
        }
        for (int i = 1; i < q.length; i++) {
            if (p[i - 1] > p[i]) {
                long buf = p[i];
                p[i] = p[i - 1];
                p[i - 1] = buf;
                if (i > 1){
                    i -= 2;
                }
                else {
                    i--;
                }

            }
        }
        System.out.println("\nsorted fractions with a common denominator");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + "/" + q[i] + "     ");
        }
    }
}
