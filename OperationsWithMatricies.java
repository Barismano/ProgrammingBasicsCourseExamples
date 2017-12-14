package com.company;

public class Main {

    public static void main(String[] args)
    {

        int[][] arr = {{1,4,6,10},
                        {2,7,5,3}};
        int [][] arr2 = {{1,4,6},{2,7,5},{9,0,11},{3,1,0}};


        int[][] result = multiplyMatrix(arr,arr2);

        printMatrix(result);

    }

    public static int[][] transposeMatrix(int[][] m1)
    {
        int[][] result = new int[m1[0].length][m1.length];


        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++)
               result[j][i]=m1[i][j];
            }
            return  result;

    }
    public static  int[][] multiplyMatrix(int[][] m1, int[][] m2)
    {
        int[][] result = new int[m1.length][m2[0].length];
        if(m1[0].length!=m2.length)
            return null;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++)
            {
                for (int k = 0; k < m1[i].length; k++)
                    result[i][j]+= m1[i][k]*m2[k][j];
            }

        }
        return  result;

    }
    public static int[][] substractMatrix(int[][] m1,int[][] m2)
    {
        MultiplyMatrixWithScalar(m2,-1);
        int[][] result = addMatrix(m1,m2);
        MultiplyMatrixWithScalar(m2,-1);
        return result;
    }
    public  static int[][] addMatrix(int[][] m1,int[][] m2)
    {
        if(m1.length!=m2.length||m1[0].length!=m2[0].length)
            return null;
        int[][] result = new int[m1.length][m1[0].length];

        for (int row = 0; row < result.length; row++) {

            for (int col = 0; col < result[row].length; col++)
                result[row][col]=m1[row][col]+m2[row][col];

        }
        return result;

    }
    public static void MultiplyMatrixWithScalar(int [][] matrix,int scalar)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]*=scalar;
            }
        }
    }
    public static void printMatrix(int[][] m1)
    {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++)
                System.out.print(m1[i][j]+"  ");
            System.out.println();
        }
    }



}
