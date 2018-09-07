package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int a =270;
        int b =72;
        while(b!=0)
        {
         int temp = a%b;
         a=b;
         b=temp;
        }
        System.out.println(a);
    }


}
