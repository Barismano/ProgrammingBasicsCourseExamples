package asdsaddas;

public class Main
{
    public static void main(String[] args)
    {
       int[][] matrix = new int[5][5];

       int count = 1;
      /*  for (int i = 0; i < matrix.length; i++)  //vertical fill
        {
            int num = i+1;
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j]=num;
                num+=5;
            }
        } */
        /* for (int i = 0; i < matrix.length; i++)  //fill glawen diagonal with 1, everything else with 2
        {

            for (int j = 0; j < matrix[i].length; j++)
            {
                if(i==j)
                    matrix[i][j]=1;
                else
                    matrix[i][j]=2;
            }
        } */
        for (int i = 0; i < matrix.length; i++)  //fill glawen diagonal with 1, everything else with 2
        {

            for (int j = 0; j < matrix[i].length; j++)
            {
                if(i==0||j==0||i==matrix.length-1||j==matrix[i].length-1||i==j||i+j==4)
                    matrix[i][j]=1;
            }
        }
        Print(matrix);


    }
    
    public static void Print(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) //i -> rows
        {
            for (int j = 0; j < matrix[i].length; j++) // j->colls
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
