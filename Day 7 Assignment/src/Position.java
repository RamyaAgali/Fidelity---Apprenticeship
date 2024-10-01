import java.util.Scanner;

public class Position {
    int data;
    Node next;

    public Position(int x) {
        this.data = data;
        this.next = null;
    }
}
class Link {
    private Node head;
   public void display(int data, int position) {
       Node node = new Node(data);
       if(position  == 0){
           node.next = head;
           head = node;
           return;
       }
       Node current  = head;
       for(int i = 0; current != null && i < position - 1; i++){
           current = current.next;
       }
       if(current == null){
           System.out.println("Position out of bounds.Node cannot be inserted.");
           return;
       }
       node.next = current.next;
       current.next = node;
   }
   public void printList(){
       Node current  = head;
       while(current != null){
           System.out.println(current.data + " " );
           current = current.next;
       }
       System.out.println();
   }
   public static void main(String[] args) {
       Link link = new Link();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the list: ");
       int size = sc.nextInt();
       System.out.println("Enter the data: ");
       for(int i = 0; i < size; i++){
           int value = sc.nextInt();
           link.display(value, 0);
       }
       System.out.println("Enter the value to insert:");
       int valueToInsert = sc.nextInt();
       System.out.println("Enter the position: ");
       int positionToInsert = sc.nextInt();
       link.display(valueToInsert, positionToInsert);
       System.out.println("Linked list after insertion ");
       link.printList();
       sc.close();
   }
}
