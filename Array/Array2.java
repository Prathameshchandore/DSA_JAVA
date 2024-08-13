import java.util.Scanner;

class Array2 {

     public static void main(String[] args)
     {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Rows : ");
          int rows = sc.nextInt();

          System.out.println("Enter Cols : ");
          int cols = sc.nextInt();

          int arr2 [][] = new int[rows][cols];

          // input

          for (int i = 0; i < rows; i++) 
          {
               for (int j = 0; j < cols; j++) 
               {
                    arr2[i][j] = sc.nextInt();
               }               
          }

          // output

          // for (int i = 0; i < rows; i++) 
          // {
          //      for (int j = 0; j < cols; j++) 
          //      {
          //           System.out.print( arr2[i][j] + " ");
          //      }     

          //      System.out.println();
          // }
          
          System.out.println("Enter x : ");
          int x = sc.nextInt();
          for (int i = 0; i < rows; i++) 
          {
               for (int j = 0; j < cols; j++) 
               {
                    if (arr2[i][j] == x) 
                    {
                         System.out.println("We found X at Location : " + "[" + i + "]"  + "[" + j + "]" );
                    }
               }
          }

     }
}