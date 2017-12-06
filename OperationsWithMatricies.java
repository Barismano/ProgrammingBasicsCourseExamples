package com.company;

public class Main {

    public static void main(String[] args) {
       int[][] M1 = {{0,1,2},
                     {9,8,7}};

        int[][] M2 = {{6,5,4},
                      {3,4,5}};


        int[][] finalMatrix = substractMatrix(M2,M1);

        if(finalMatrix==null)
            System.out.println("ivalid matrixes");
        else {
            for (int i = 0; i < finalMatrix.length; i++) {
                for (int j = 0; j < finalMatrix[i].length; j++) {
                    System.out.print(finalMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }


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


    }

