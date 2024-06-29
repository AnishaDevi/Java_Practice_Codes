package ControlFlow;
import java.util.Scanner;

public class NumberPalindrome
{
    public static boolean isPalindrome(int number)
    {
        int reversed_number = 0;
        int original_number = number;
        while(number != 0)
        {
            reversed_number = reversed_number * 10 + number % 10;
            number /= 10;
        }
        return reversed_number == original_number;

    }
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = sc.nextInt();
        System.out.println(isPalindrome(number));
    }
}
