import java.util.Scanner;

class Array1 {

     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int a = sc.nextInt();
        
        int marks[] = new int[a];
        
        for (int i = 0; i < a; i++) 
        {
            System.out.println("Enter Marks of Subject : " + i);
            marks[i] = sc.nextInt();
        }

        System.out.print("Enter marks to be Searched : ");
        int x = sc.nextInt();

        for (int i = 0; i < a; i++) 
        {
            if (marks[i] == x) 
            {
               System.out.println("We found our required subject marks at index " + i); 
            }
        }

     }
}