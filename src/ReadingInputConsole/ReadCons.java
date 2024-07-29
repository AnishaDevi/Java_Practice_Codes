package ReadingInputConsole;
//should run this code in terminal java file_path/classname.java
//here java src/ReadingInputConsole/ReadCons.java
public class ReadCons
{
    public static String getStringFromConsole(int currentYear)
    {
        String name = System.console().readLine("Hi , What is your name? ");
        System.out.println("Thanks "+name);

        String dateOfBirth = System.console().readLine("What year you were born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are "+age+" years old";
    }
    public static void main(String[] args)
    {
        int currentYear = 2024;
        //Scanner sc = new Scanner(System.in);

        System.out.println(getStringFromConsole(currentYear));
    }
}
