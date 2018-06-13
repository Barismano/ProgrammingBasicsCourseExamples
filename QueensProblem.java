package com.company;


import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
   public static int count=0;
 public static void Queen(boolean[][] chessBoard,int x,int y)
    {
        if(x>=8)
        {
            print(chessBoard);
            return;
        }
        if(y>=8)
            return;
        if(!isBitoPole(chessBoard,x,y))
        {
            chessBoard[x][y]=true;
           Queen(chessBoard,x+1,0);
           chessBoard[x][y]=false;
            Queen(chessBoard,x,y+1);
        }
        else
        {
            Queen(chessBoard,x,y+1);
        }

    }
    public static void print(boolean[][] matrix)
    {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(matrix[i][j])
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
        count++;
    }
    public static void main(String[] args)
    {

        boolean[][] chessBoard=new boolean[8][8];

        for (int i = 0; i < 8; i++)
        {

                chessBoard[0][i]=true;

            for (int j = 0; j < 8; j++)
            {
                if(!isBitoPole(chessBoard,1,j))
                    chessBoard[1][j]=true;
                else
                    continue;
                for (int k = 0; k < 8; k++)
                {
                    if(!isBitoPole(chessBoard,2,k))
                        chessBoard[2][k]=true;
                    else
                        continue;
                    for (int l = 0; l < 8; l++)
                    {
                        if(!isBitoPole(chessBoard,3,l))
                            chessBoard[3][l]=true;
                        else
                            continue;
                        for (int m = 0; m < 8; m++)
                        {
                            if(!isBitoPole(chessBoard,4,m))
                                chessBoard[4][m]=true;
                            else
                                continue;
                            for (int n = 0; n < 8; n++)
                            {
                                if(!isBitoPole(chessBoard,5,n))
                                    chessBoard[5][n]=true;
                                else
                                    continue;
                                for (int o = 0; o < 8; o++)
                                {
                                    if(!isBitoPole(chessBoard,6,o))
                                        chessBoard[6][o]=true;
                                    else
                                        continue;
                                    for (int p = 0; p < 8; p++)
                                    {
                                    if(!isBitoPole(chessBoard,7,p))
                                    {
                                        chessBoard[7][p]=true;
                                        for (int q = 0; q < 8; q++)
                                        {
                                            for (int r = 0; r < 8; r++)
                                            {
                                                if(chessBoard[q][r])
                                                    System.out.print(1);
                                                else
                                                    System.out.print(0);
                                            }
                                            System.out.println();

                                        }
                                        chessBoard[7][p]=false;
                                        System.out.println();System.out.println();
                                        count++;
                                    }


                                    }
                                    chessBoard[6][o]=false;
                                }
                                chessBoard[5][n]=false;
                            }
                            chessBoard[4][m]=false;
                        }
                        chessBoard[3][l]=false;
                    }
                    chessBoard[2][k]=false;
                }
                chessBoard[1][j]=false;
            }
            chessBoard[0][i]=false;
        }
        System.out.println(count);
    }


    public static boolean isBitoPole(boolean chessBoard[][], int x,int y)
    {
        for (int i = 0; i < 8; i++)
        {
            if(chessBoard[i][y]||chessBoard[x][i])
                return true;
        }
        int tempx=x;
        int tempy=y;
        while(tempx>=0&&tempy>=0&&tempx<8&&tempy<8)
        {
            if(chessBoard[tempx][tempy])
                return true;
            tempx++;
            tempy++;
        }
        tempx=x;
        tempy=y;
        while(tempx>=0&&tempy>=0&&tempx<8&&tempy<8)
        {
            if(chessBoard[tempx][tempy])
                return true;
            tempx--;
            tempy++;
        }
        tempx=x;
        tempy=y;
        while(tempx>=0&&tempy>=0&&tempx<8&&tempy<8)
        {
            if(chessBoard[tempx][tempy])
                return true;
            tempx++;
            tempy--;
        }
        tempx=x;
        tempy=y;
        while(tempx>=0&&tempy>=0&&tempx<8&&tempy<8)
        {
            if(chessBoard[tempx][tempy])
                return true;
            tempx--;
            tempy--;
        }
        return false;
    }






    public static void Var(int[] arr,int[] free,int index)
    {
        if(index==free.length) {
            System.out.println(Arrays.toString(free));
            count++;
            return;
        }
            for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            free[index]=num;
            Var(arr,free,index+1);
        }
    }
}



