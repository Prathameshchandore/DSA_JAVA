import java.util.Scanner;

class Functions2 {

     public static void main(String[] args)
     {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter a : ");
        int a = sc.nextInt();

        System.out.println("Enter b : ");
        int b = sc.nextInt();

        System.out.println("The Product of 2 numbers is : "+ calculateProduct(a, b));
     }

     public static int calculateProduct(int a, int b)
     {
        return a * b;
     }
}