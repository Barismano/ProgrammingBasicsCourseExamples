package asdsaddas;

public class Main {

    public static void main(String[] args)
    {
        int n =10;
        int bitMask = 1073741824;
        for (int i = 0; i <= 30; i++)
        {
            if((n&bitMask)!=0)
                System.out.print(1);
            else
                System.out.print(0);
            bitMask/=2;
        }
    }




}
