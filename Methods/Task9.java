import java.util.Scanner;
//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

public class Task9 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter equals x y z t (all > 0):");
        double x = console.nextDouble();
        double y = console.nextDouble();
        double z = console.nextDouble();
        double t = console.nextDouble();
        System.out.println("area of the quadrilateral: "+ areaQuad(x, y, z, t));
    }
    public static double areaQuad(double x, double y, double z, double t)
    {
        double d = Math.sqrt(x * x + y * y);
        double p = (d + t + z) / 2;
        double s = (x * y / 2) + Math.sqrt(p * (p - t) * (p - z) * (p - d));
        return s;
    }
}
