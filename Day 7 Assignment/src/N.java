import java.util.Scanner;

public class N {
    int d;
    N next;

    public N(int d){
        this.d = d;
        this.next = null;

    }
}
class Linkedlist{
     N head;
     public Linkedlist(){
         head = null;
     }
    public void insert(int d)
    {
        N node = new N(d);

        if (head == null)
        {
            head = node;
        }
        else
        {
            N current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = node;
        }

        }
        public void List(){
        N current = head;
        while(current != null){
            System.out.print(current.d);
            current = current.next;
            if(current != null){
                System.out.print("->");
            }
        }
            System.out.print("-> Null");
        }
        public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist();
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the Linkedlist");
            int s = sc.nextInt();
            System.out.println("Enter the elements of the Linkedlist");
            for (int i = 0; i < s; i++) {
                int d = sc.nextInt();
                linkedlist.insert(d);
            }
            System.out.println("Linkedlist after insertion:");
            linkedlist.List();
            sc.close();
        }
    }

