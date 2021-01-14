import java.util.Scanner;
//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Task3 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter the side of the correct hexagon a (a>0) :");
        int a = console.nextInt();
        System.out.println("Area of a correct hexagon:   " + 6 * areaTriangle(a));
    }
    public static double areaTriangle(double a)
    {
            return a * a * Math.sqrt(3) / 4;
    }
}
