package Overloading;
import java.util.Scanner;

public class AreaCalculator {
    public static final int INVALID_VALUE = -1;
    public static double area(double radius)
    {
        if(radius > 0)
            return Math.PI * radius * radius;
        else
            return INVALID_VALUE;
    }
    public static double area(double length,double breadth)
    {
        if(length>0 && breadth>0)
            return length * breadth;
        else
            return INVALID_VALUE;
    }

    public static void main(String[] args)
    {
        double radius,length,breadth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        System.out.println("Enter the Length and Breadth of rectangle: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        System.out.println("The Area of Circle = "+area(radius));
        System.out.println("The Area of Rectangle is = "+area(length,breadth));
    }
}

