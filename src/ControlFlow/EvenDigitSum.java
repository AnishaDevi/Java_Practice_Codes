package ControlFlow;
import java.util.Scanner;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number)
    {
        int sum=0;
        if(number < 0)
            return -1;
        for(int i=number ; i>0 ; i/=10)
        {
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0)
            {
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println("The sum of even digits is: "+getEvenDigitSum(number));
    }
}
