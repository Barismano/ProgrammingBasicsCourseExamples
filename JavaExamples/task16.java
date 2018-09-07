package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int a =12;
        int b =34;

        for (int i = a; i < 24; i++)
        {
            for (int j = 0; j < 59; j++)
            {
                if(!(i==a&&j<b))
                    System.out.println(i+":"+j);
            }
        }


    }


}
