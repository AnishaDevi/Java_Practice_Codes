import java.util.Scanner;
public class EqualityPrinter {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
    public static final String NEITHER_ALL_EQUAL_MESSAGE = "Neither all are equal nor different";
    public static final String ALL_DIFFERENT_MESSAGE = "All numbers are different";

    public static void printEqual(int x,int y,int z)
    {
        if(x<0 || y<0 || z<0)
            System.out.println(INVALID_VALUE_MESSAGE);
        else if(x==y && y==z)
            System.out.println(ALL_EQUAL_MESSAGE);
        else if(x!=y && y!=z && z!=x)
            System.out.println(ALL_DIFFERENT_MESSAGE);
        else
            System.out.println(NEITHER_ALL_EQUAL_MESSAGE);
    }
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        printEqual(x,y,z);
    }
}
