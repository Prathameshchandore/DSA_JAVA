import java.util.*;

class Linked_List
{

    Node head;

    class Node 
    {
        String data;
        Node next;
        
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(String data)
    {
       Node newNode = new Node(data);

       if(head == null)
       {
            head = newNode;
            return;
       }

       newNode.next = head;
       head = newNode;

    }

    // add Last

    public void addLast(String data)
    {
       Node newNode = new Node(data);

       if(head == null)
       {
            head = newNode;
            return;
       }

       Node currentNode = head;
       while(currentNode.next != null)
       {
           currentNode = currentNode.next;
       }

       currentNode.next = newNode;

    }

    public void printList()
    {
       Node currentNode = head;
       while(currentNode != null)
       {
           System.out.print (currentNode.data + " -> ");
           currentNode = currentNode.next;
       }

       System.out.println("NULL");
 
    }

    public void delFirst()
    {

       if(head == null)
       {
            System.out.println("This list is empty");
            return;
       }

       head = head.next;

    }

    public void delLast()
    {
         if(head == null)
       {
            System.out.println("This list is empty");
            return;
       }

       Node secLastNode = head;
       Node lastNode = head.next;

       while (lastNode.next != null) 
       {
            lastNode = lastNode.next;
            secLastNode = secLastNode.next;
       }

       secLastNode.next = null;

    }


    public static void main(String[] args)
    {
        Linked_List list = new Linked_List();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("List");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.delFirst();
        list.printList();

        list.delLast();
        list.printList();


    }
}