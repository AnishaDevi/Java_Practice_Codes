package ReadingInputConsole;
import java.util.Scanner;

public class ReadScanner {
    public static String getStringFromScanner(int currentYear) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi , What's your Name?");
        String name = sc.nextLine();

        System.out.println("Hi " + name);

        System.out.println("What year were you born?");

        boolean validyob = false;
        int scanner_age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                scanner_age = checkData(currentYear, sc.nextLine());
                validyob = scanner_age < 0 ? false : true;
            }catch(NumberFormatException badUserDate){
                System.out.println("Characters not allowed!!!try again..");
            }
        }while(!validyob);

        return "So you are " + scanner_age + " years old";
    }
    public static int checkData(int currentYear , String yearOfBirth)
    {
        int yob = Integer.parseInt(yearOfBirth);
        int minYear = currentYear - 125;

        if((yob < minYear) || (yob > currentYear))
            return -1;
        return (currentYear - yob);
    }

    public static void main(String[] args) {
        int currentYear = 2024;
        //Scanner sc = new Scanner(System.in);

        System.out.println(getStringFromScanner(currentYear));
    }
}


//Output
//    Hi , What's your Name?
//    Anna
//    Hi Anna
//    What year were you born?
//    Enter a year of birth >= 1899 and <= 2024
//            2025
//    Enter a year of birth >= 1899 and <= 2024
//            2000
//    So you are 24 years old