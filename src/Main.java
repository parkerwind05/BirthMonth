import java.sql.SQLOutput;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        int birthMonth = 0;
        System.out.print("Enter your birth month: ");


        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
            if(birthMonth>=1 && birthMonth<=12)
            {
                System.out.println("Your birth month is: "+ birthMonth);
            }
            else
            {
                System.out.println(birthMonth + " is not a valid birth month.");
            }

        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash + ", not a number!");
            System.out.println("Run the program again with correct input.");
        }




    }
}