package ReadingInputConsole;
import java.util.Scanner;

public class MinAndMax
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true)
        {
            System.out.println("Enter the number , or any character to exit");
            String nextNumber = sc.nextLine();
            try
            {
                double validNumber = Double.parseDouble(nextNumber);
                if(loopCount == 0 || validNumber < min)
                {
                    min = validNumber;
                }
                if(loopCount == 0 || validNumber > max)
                {
                    max = validNumber;
                }
                loopCount++;
            }
            catch(NumberFormatException nfe)
            {
                break;
            }
        }
        if(loopCount > 0)
        {
            System.out.println("min = " + min + " , max = " + max);
        }
        else
        {
            System.out.println("No Valid data entered");
        }
    }
}


//Output
//    Enter the number , or any character to exit
//    -1
//    Enter the number , or any character to exit
//    0
//    Enter the number , or any character to exit
//    1
//    Enter the number , or any character to exit
//    100
//    Enter the number , or any character to exit
//    56
//    Enter the number , or any character to exit
//    500
//    Enter the number , or any character to exit
//    -100
//    Enter the number , or any character to exit
//            end
//    min = -100.0 , max = 500.0
