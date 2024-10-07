import org.w3c.dom.Node;

import java.util.Scanner;

public class Linkedlist
{
    Node h;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void insert(int data)
    {
        Node node = new Node(data);
        if (h == null)
        {
            h = node;
        }
        else
        {
            Node temp = h;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void remove(int index)
    {
        if (h == null)
        {
            System.out.println("List is empty");
            return;
        }
        if (index == 0)
        {
            h = h.next;
            return;
        }
        Node temp = h;

        for (int i = 0; i < index - 1; i++)
        {
            if (temp.next == null)
            {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Index out of bounds");
            return;
        }
        temp.next = temp.next.next;
    }
        public void show()
        {
            if(h == null)
            {
                System.out.println("List is empty");
                return;
            }
            Node temp = h;
            while(temp != null)
            {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
       public static void main(String[] args)
       {
            Scanner sc = new Scanner(System.in);
            Linkedlist l = new Linkedlist();
            System.out.println("Enter the number of elements for Linkedlist");
            int n = sc.nextInt();
           System.out.println("Enter the elements of Linkedlist");
            for(int i = 0; i<n; i++)
            {
                int element = sc.nextInt();
                l.insert(element);
            }
            System.out.println("Linked list is: ");
            l.show();
           System.out.println("Enter the index of the element to be removed from list");
           int index = sc.nextInt();
           l.remove(index);
           System.out.println("Linked list after removing particular elemenyt:");
           l.show();
           sc.close();
        }
    }

