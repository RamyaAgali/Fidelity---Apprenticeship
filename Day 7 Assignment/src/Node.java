import java.util.Scanner;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class List{
private Node h;

public void insert(int data) {
    Node node  = new Node(data);
    node.next = h;
    h = node;
}
public void display() {
    Node temp = h;
    while(temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
    }
}
public static void main (String[] args) {
    List list  = new List();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the list: ");
    int s = sc.nextInt();
    System.out.println("Enter the elements of the list: ");
    for (int i = 0; i < s; i++) {
        int data = sc.nextInt();
        list.insert(data);
    }
    System.out.println("The list is: ");
    list.display();
    sc.close();
}
}
