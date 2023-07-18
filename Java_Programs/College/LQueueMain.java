import java.util.*;
class Node {
    int data;
    Node next;
}

class LQueue {
    Node rear = null;
    Node front = null;

    public void enque(){
        Node n = new Node();
        //n.data = x;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        n.data = x;
        if(front == null) {
            front = n;
            rear = n;
            front.next = rear.next = null;
        } else {
            rear.next = n;
            rear = n;
            rear.next = null;
        }
    }

    public void deque() {
        //System.out.println(top.data);
        Node n = front;
        if(front == null) {
            System.out.println("Queue is underflow.");
        } else {
            front = front.next;
            System.out.println(n.data);
            n.next = null;
        }
    }

    public void display() {
        Node n = front;
        if(front == null) {
            System.out.println("Queue is empty.");
        } else {
            while(n != rear) {
                System.out.println(n.data);
                n = n.next;
            }
            System.out.println(n.data);
        }
    }

}

class LQueueMain {
    public static void main(String[] args) {
        int n = 1;
        LQueue s = new LQueue();

        Scanner sc = new Scanner(System.in);

        while(n == 1) {
            System.out.println("*****Enter your choice*****");
            System.out.println("1. INSERT");
            System.out.println("2. DELETE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");

            int ch = sc.nextInt();

            switch(ch) {
                case 1 : System.out.println("Enter your element which you want to insert: ");
                    s.enque();
                    break;
                case 2 : System.out.println("Element which you want to delete is: ");
                    s.deque();
                    break;
                case 3 : System.out.println("Element of queue is:");
                    s.display();
                    break;
                case 4 : System.out.println("Wrong Choise.");
                    return;
            }

            System.out.println("To be continue press 1.");
            n = sc.nextInt();
        }
    }
}