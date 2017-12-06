package com.company;


import sun.text.resources.vi.CollationData_vi;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {



        int[] arrOneDimension = {3,5,6,7};
        int[][] arr = new int[6][];

        int[][] Matrix = {
                            {3,2,9,0},
                            {1,2,8,1},
                            {5,6,7,12}
                      };

        // One-dimension array printing
        for (int i = 0; i < arrOneDimension.length; i++) {
            System.out.print(arrOneDimension[i]+" ");
        }
        System.out.println();
       

        //Matrix.length  -> връща броя на редовете
        //Matrix[i].length -> връща ни броя на елементите в i-тия ред
        // Two-Dimensional Arrays printing
        for (int row = 0; row < Matrix.length; row++) {

            for (int col = 0; col < Matrix[row].length; col++)
                System.out.print(Matrix[row][col]+" ");

            System.out.println();

        }
       
    }

    

    public static int sumElements(int[][] matrix)
    {
      int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                sum += matrix[i][j];
        }
         return  sum ;
    }
   public static void inverseRow(int[][] m,int row)
    {
        for (int i = 0; i < m[row].length/2; i++)
        {
            int temp = m[row][i];
            m[row][i]=m[row][m[row].length-1-i];
            m[row][m[row].length-1-i]=temp;

        }
        
    }
}
