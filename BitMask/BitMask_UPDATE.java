import java.util.Scanner;

class BitMask_UPDATE{

     public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operation : ");
        int oper = sc.nextInt();

        int n = 5;
        int pos = 2; //pos : 2 for "0" and pos : 1 for "1"

        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        if(oper == 1)
        {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }

        else
        {
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }
     }
}