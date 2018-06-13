import java.util.Scanner;

public class MyFirstProgram
{


    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        if(n==6)
        {
            System.out.println("Excellent!");
        }
        else if(n==5)
        {
            System.out.println("Very good");
        }
        else if(n==4)
        {
            System.out.println("Good");
        }
        else if(n==3) {
            System.out.println("Average");
        }
        else if(n==2)
        {
                System.out.println("Poor");
        }
        else
        {
            System.out.println("Invalid grade!");
        }
    }

}

