import java.util.Scanner;
public class SpeedConverter
{
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour<0)
            return -1;
        else
        {
            return Math.round((1/1.609)*kilometersPerHour);
        }
    }
    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour<0)
        {
            System.out.println("Invalid Value");
        }
        else{
            long to_miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +" km/h = "+Math.round(to_miles)+" mi/h");
        }
    }
    public static void main(String[] args)
    {
        double kilometersPerHour;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed in km/h:");
        kilometersPerHour = sc.nextDouble();

        printConversion(kilometersPerHour);
    }
}
