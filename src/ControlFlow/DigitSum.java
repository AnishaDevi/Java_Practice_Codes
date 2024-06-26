package ControlFlow;
import java.util.Scanner;

public class DigitSum
{
    public static int calculateDigitSum(int number)
    {
        int sum = 0;
        if(number<0)
            return -1;
        while(number > 9)//till last but one digit from right to left
        {
            sum += number % 10;
            number = number/10;
        }
        sum += number;//for left most digit
        return sum;
    }
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = sc.nextInt();

        System.out.println("The sum of digits in the number "+number+" is "+calculateDigitSum(number));
    }
}
