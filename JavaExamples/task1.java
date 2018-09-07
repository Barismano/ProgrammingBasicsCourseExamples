import java.util.Scanner;

public class MyFirstProgram
{


    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);

        String sideAString = console.nextLine();
         int sideA = Integer.parseInt(sideAString);
        String sideBString = console.nextLine();
         int sideB = Integer.parseInt(sideBString);
         int area = sideA*sideB;
        System.out.println("The area is : "+ area);

    }

}