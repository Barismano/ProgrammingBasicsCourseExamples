import com.sun.org.apache.regexp.internal.RE;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
  

    }
}
class Set
{
    private int[] arr;
    private int count;
    private int capacity;

    Set()
    {
        capacity=8;
        arr=new int[capacity];
    }
    public boolean add(int num)
    {
        if(IndexOf(num)!=-1)
            return false;
        if(count==capacity)
            Resize();
        arr[count]=num;
        count++;
        return  true;
    }
    public boolean remove(int num)
    {
        int index= IndexOf(num);
        if(index==-1)
            return false;
        for (int i = index; i < count-1; i++) {
            arr[i]=arr[i+1];
        }
        count--;
        return true;



    }
    private int IndexOf(int a) //проверява дали елементът го има в масива. Ако го има , връща индекса му,ако го няма връща -1(защото -1 е несъществуващ индекс)
    {
        for (int i = 0; i < count; i++) {
            if(a==arr[i])
                return i;
        }
        return -1;

    }
    private void Resize()
    {
        int[] temp = new int[capacity*2];
        for (int i = 0; i < count; i++) {
            temp[i]=arr[i];
        }
        arr=temp;
        capacity=capacity*2;
    }

    public String toString()
    {
        String result="";
        for (int i = 0; i < count; i++) { ///Грешно е да се конкатенират така стрингове, но ще говорим друг път на темата.
            result+=arr[i]+ " ";
        }
        return  result;
    }


}
