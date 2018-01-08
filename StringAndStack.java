package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        CustomString str1 = new CustomString("Vampir");
        CustomString str2 = new CustomString(" Drakula");
        CustomString result = str1.Add(str2);
        result.toUpper();
        String q = new ()
        result.toLower();
        result.print();

    }
}
class CustomString
{
   private char[] arr;

   CustomString(String a)
   {
       arr = new char[a.length()];
       for (int i = 0; i < arr.length; i++)
           arr[i]=a.charAt(i);  //или просто a.toCharArray

   }

   char charAt(int position)
   {
       if(position<0||position>= arr.length)
           throw new IndexOutOfBoundsException("Няма такъв индекс!");
       return arr[position];
   }
   CustomString Add(CustomString other)
   {
       CustomString result = new CustomString();
       result.arr = new char[this.arr.length+other.arr.length];
       for (int i = 0; i < arr.length; i++)
           result.arr[i]=arr[i];
       for (int i = 0; i < other.arr.length; i++) {
           result.arr[arr.length+i]=other.arr[i];
       }
       return result;


   }
   void toUpper()
   {
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]<='z'&&arr[i]>='a')
               arr[i]-=32;
       }
   }
   void toLower()
   {
       for (int i = 0; i < arr.length; i++) {
          if(arr[i]>='A'&&arr[i]<='Z')
            arr[i]+=32;
       }
   }
   void print()
   {
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]);
       }
       System.out.println();
   }


}
class CustomStack
{
    String[] arr;
    int count;
    CustomStack()
    {
        arr=new String[8];
        count=0;
    }
    void Push(String str)
    {
        if(count==arr.length)
        {}//Resize();
        arr[count]=str;

    }
    public boolean isEmpty()
    {
        return count==0;
    }
    public String Peek()
    {
        if(isEmpty())
            return "";
        return arr[count];

    }
    public String Pop()
    {
        String result = Peek();
        count--;
        return result;
    }
    private void Resize()
    {
        String[] temp = new String[arr.length*2];
        for (int i = 0; i < arr.length; i++)
            temp[i]=arr[i];
        arr=temp;
    }

}
