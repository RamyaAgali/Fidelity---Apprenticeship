import java.util.Scanner;

public class reverseList {
    int data;
    Node next;
    public reverseList(int data){
        this.data = data;
        this.next = null;
    }
}
class Linked {
    private Node head;

    public void display(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public void reverse() {
        Node pre = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        head = pre;

    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linked list = new Linked();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        for (int i = 0; i < data; i++) {
            int value = sc.nextInt();
            list.display(value);
        }
        System.out.println("The original linkedlist is: ");
        list.print();
        list.reverse();
        System.out.println("The reversed linkedlist is: ");
        list.print();
        sc.close();
    }
}
