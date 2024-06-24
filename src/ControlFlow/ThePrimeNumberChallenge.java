package ControlFlow;
import java.util.Scanner;

public class ThePrimeNumberChallenge {
    public static boolean isPrime(int wholeNumber)
    {
        if(wholeNumber <= 2)
            return (wholeNumber == 2);

        for(int divisor=2 ; divisor<wholeNumber ; divisor++)
        {
            if(wholeNumber % divisor == 0)
                return false;

        }
        return true;
    }
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to test");
        number = sc.nextInt();

        System.out.println("The number " + number + " is " + (isPrime(number)?"is Prime":"not a prime")+" number");
    }
}
