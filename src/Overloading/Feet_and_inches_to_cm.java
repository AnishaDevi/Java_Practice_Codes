package Overloading;
import java.util.Scanner;
public class Feet_and_inches_to_cm {
    public static double convertToCentimeters(double inches)
    {
        return inches * 2.54;
    }
    public static double convertToCentimeters(double feet,double inches)
    {
        double feetToInches = feet * 12;
        double totalInches = feetToInches + inches;
        return convertToCentimeters(totalInches);
    }
    public static void main(String[] args)
    {
        double inches,feet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of feet:");
        feet = sc.nextDouble();
        System.out.println("Enter the value of inches:");
        inches = sc.nextDouble();

        if(feet != 0)
            System.out.println(feet+"ft , "+inches+"in = "+convertToCentimeters(feet,inches)+"cm");
        else
            System.out.println(inches+"in = "+convertToCentimeters(inches)+"cm");
    }

}
