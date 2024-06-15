package Overloading;
import java.util.Scanner;
public class TimeConversion
{
    public static String getDuration(int seconds)
    {
        if(seconds<0)
        {
            return "Invalid data for seconds(" +seconds+"),must be a possible integer value";
        }
        int minutes = seconds/60;
        return getDuration(minutes,seconds%60);
    }
    public static String getDuration(int minutes,int seconds)
    {
        if(minutes<0)
        {
            return "Invalid data for minutes(" +minutes+"),must be a possible integer value";
        }
        if(seconds<0 || seconds>59)
        {
            return "Invalid data for seconds("+seconds+"),must be between zero and 59";
        }
        int hours = minutes/60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        return hours+"h "+remainingMinutes+"m "+remainingSeconds+"s";
    }

    public static void main(String[] args)
    {
        int hours,minutes,seconds;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours:");
        hours = sc.nextInt();
        System.out.println("Enter minutes:");
        minutes = sc.nextInt();
        System.out.println("Enter seconds:");
        seconds = sc.nextInt();

        if(hours==0 && minutes==0)
            System.out.println(getDuration(seconds));
        else if(hours==0)
            System.out.println(getDuration(minutes,seconds));
        else
            System.out.println(hours+"h "+minutes+"m "+seconds+"s");
    }
}
