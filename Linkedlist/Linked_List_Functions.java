import java.util.*;

class Linked_List_Functions
{
    public static void main(String[] args)
    {
       LinkedList<String> list = new LinkedList<String>();

       list.add("a");
       list.addFirst("is");
       list.addLast("List");
       list.addFirst("This");

       System.out.println(list);

       list.removeLast();
       System.out.println(list);

        int Size = list.size();
        System.out.println(Size);

        list.add("List");
        System.out.println(list);


       for (int i = 0; i < list.size(); i++) 
       {
            System.out.print(list.get(i) + " -> ");
       }

       System.out.println("NULL");
    }


}