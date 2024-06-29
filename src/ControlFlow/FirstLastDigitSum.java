package ControlFlow;
import java.util.Scanner;

public class FirstLastDigitSum
{
    public static int sumFirstLastDigit(int number)
    {
        if(number < 0)
         return -1;

        int first_digit = number;
        while(first_digit > 9)
        {
            first_digit /= 10;
        }

        int last_digit = number % 10;

        return first_digit + last_digit;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println("The sum of first and last digit of the number is: "+sumFirstLastDigit(number));
    }
}
