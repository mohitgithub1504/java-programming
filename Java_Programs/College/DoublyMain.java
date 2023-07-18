import java.util.*;
class Node {
    int data;
    Node next;
    Node prev;
}

class DLinkedLists {
    Node head;
    public void insert (int value) {
        Node n1 = new Node();
        n1.data = value;

        if(head == null) {
            head = n1;
            n1.next = null;
            n1.prev = null;
        } else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = n1;
            n1.prev = n;
        }
    }
    public void show() {
        Node n = head;
        while(n.next != null) {
            System.out.print(n.data+ " ");
            n = n.next;
        }
        System.out.println(n.data);
    }

   //insertion
    public void insert_beg(int x) {
        Node n1 = new Node();
        n1.data = x;
        n1.prev = null;
        n1.next = head;
        head.prev = n1;
        head = n1;
    }
    public void insert_end(int x) {
        Node n = head;
        Node n1 = new Node();
        n1.data = x;
        n1.next = null;
        while(n.next != null) {
            n = n.next;
        }
        n1.prev = n;
        n.next = n1;
    }
    public void insert_loc(int x) {
        Node n = head;
        Node n1 = new Node();
        n1.data = x;
        System.out.println("Enter the location for insert: ");
        Scanner sc = new Scanner(System.in);
        int loc = sc.nextInt();

        for(int i=1; i<loc-1; i++) {
            n = n.next;
        }
        n1.next = n.next;
        n.next = n1;
        n1.prev = n;
        n = n1.next;
        n.prev = n1;
    }
 
    //deletion
    public void delete_beg() {
        //System.out.println(head.data);
        Node n = head;
        head = head.next;
        System.out.println(n.data);
        n.next = null;
        head.prev = null;
    }
   public void delete_end() {
        Node n = head;
        while((n.next).next != null) {
            n = n.next;
        }
        Node n1 = n.next;
        System.out.println(n1.data);
        n.next = null;
        n1.prev = null;
    }
   public void delete_loc() {
        Node n = head;
        System.out.println("Enter the location for delete: ");
        Scanner sc = new Scanner(System.in);
        int loc = sc.nextInt();

        for(int i=1; i<loc-1; i++) {
            n = n.next;
        }
        Node n1 = n.next;
        System.out.println(n1.data);
        n.next = n1.next;
        n1 = n1.next;
        n1.prev = n;
    }
}
public class DoublyMain {

    public static void main(String[] args) {
        DLinkedLists list = new DLinkedLists();
        list.insert(5);
        list.insert(1);
        list.insert(8);
        list.insert(2);
        list.insert(9);
        list.insert(3);
        list.insert(4);
        list.insert(7);
        list.insert(11);
        list.insert(80);
        //list.insert_beg(90);
        //list.insert_beg(225);
        list.insert_end(300);
        list.insert_end(789);
        //list.delete_beg();
        //list.insert_end(90);
        //list.delete_end();
        list.insert_loc(1504);
        //list.delete_loc();
        list.show();
    }
}
