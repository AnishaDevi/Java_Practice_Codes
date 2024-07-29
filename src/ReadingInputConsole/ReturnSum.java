package ReadingInputConsole;
import java.util.Scanner;

public class ReturnSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        double sum = 0;

        while (counter <= 5)
        {
            System.out.println("Enter the number # " + counter + " : ");
            String nextNumber = sc.nextLine();
            try
            {
                //int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The sum is : " + sum);
    }
}


//Output
//    Enter the number # 1 :
//    abcd
//    Invalid Number
//    Enter the number # 1 :
//        1
//    Enter the number # 2 :
//        2.2
//    Enter the number # 3 :
//        3.3
//    Enter the number # 4 :
//        4.5
//    Enter the number # 5 :
//        10
//    The sum is : 21.0

