import java.util.Scanner;

public class MyFirstProgram
{


    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        int hours = Integer.parseInt(console.nextLine());
        int mins = Integer.parseInt(console.nextLine());
        mins = mins+15;  // mins+=15
        if(mins>=60)
        {
            hours++;
            mins = mins-60; //mins-=60;
        }
        System.out.println(hours+ ":"+ mins);

      
        
    }

}
