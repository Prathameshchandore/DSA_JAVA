import java.util.*;

class ArrayLists {

     public static void main(String[] args)
     {

        ArrayList<Integer> list = new ArrayList<Integer>();
      
      //Add Elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

      //Get Elements
        int Get = list.get(3);

        System.out.println(Get);

      //Add Elements in between
       list.add(4, 4);
       System.out.println(list);

      //Set Elements
       list.set(0, 5);
       System.out.println(list);

      //Delete Elements
       list.remove(1);
       System.out.println(list);

      //Size of Elements
       int Size = list.size();
       System.out.println(Size);

      //Elements By Loop
       
       for (int i=0; i<list.size(); i++) 
       {
         System.out.print((list.get(i)) + " ");
       }

       System.out.println();

      // Sorting
       Collections.sort(list);
       System.out.println(list);
        
     }
}