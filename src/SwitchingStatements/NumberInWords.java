package SwitchingStatements;
import java.lang.String;
import java.util.Scanner;

public class NumberInWords
{
    public static void printNumberInWords(int n)
    {
        String NumberInWords = switch(n){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            default -> "OTHER";
        };
        System.out.println(NumberInWords);
    }
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = sc.nextInt();
        printNumberInWords(number);
    }
}
