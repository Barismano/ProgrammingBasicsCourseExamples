package com.company;

public class Main
{
    public static void main(String[] args)
    {
        String test = "           abcdef               ";
        String r = Trim(test);
        System.out.println(r);
    }
    public static boolean IsPalindrome(String str)
    {
        if(Reverse(str).equals(str))
        {
            return true;
        }
            return false;
    }
    public static int CountA(String stringToCheck)
    {
        int count =0;
        for (int i = 0; i < stringToCheck.length(); i++)
        {
            if(stringToCheck.charAt(i)=='a'||stringToCheck.charAt(i)=='A')
            {
                count++;
            }
        }
        return count;
    }
    public static String Trim(String text)
    {
        char whiteSpace = ' ';
        int cursor1 =0;
        while(text.charAt(cursor1)==' ')
        {
             cursor1++;
        }
        int cursor2 =text.length()-1;
        while(text.charAt(cursor2)==' ')
        {
            cursor2--;
        }
        String trimed="";
        for (int i = cursor1; i <= cursor2; i++)
        {
            trimed=trimed+text.charAt(i);
        }
        return trimed;
    }

     public static String Reverse(String str)
     {
       String result = "";
       for (int i = 0; i < str.length(); i++)
       {
           result = str.charAt(i) + result;
       }
       return result;
     }
}
