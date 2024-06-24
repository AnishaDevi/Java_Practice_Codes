package ControlFlow;
import java.util.Scanner;

public class SumOfOddPositive {
    public static boolean isOdd(int number)
    {
        if(number<0)
            return false;
        else
            return (number%2 != 0);
    }
    public static int sumOdd(int start , int end)
    {
        int sum=0;
        if(start>0 && end>0 && end>=start)
        {
            for(int i=start ; i<=end ; i++)
            {
                if(isOdd(i))
                    sum+=i;
            }
            return sum;
        }
        else
            return -1;
    }
    public static void main(String[] args)
    {
        int start,end;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        start = sc.nextInt();
        System.out.println("Enter the end number:");
        end = sc.nextInt();
        System.out.println("The sum of odd number in the range ("+start+","+end+") is "+sumOdd(start,end));
    }
}
