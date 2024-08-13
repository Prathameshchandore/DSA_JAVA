import java.util.Scanner;

class Functions3 
{

    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printfactorial(n);

    }
    
    public static void printfactorial(int n)
    {
        if(n<0)
        {
           System.out.println("Invalid Number");
           return;
        }
        
        else
        {
            
        }
        int factorial = 1;
        
        for(int i=n; i>=1; i--)
        {
            factorial = factorial * i;
        }
        
        System.out.println(factorial);
        
     }


}