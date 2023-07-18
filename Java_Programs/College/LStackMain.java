import java.util.*;
class Node {
    int data;
    Node next;
}

class LStack {
    Node top = null;

    public void push(){
        Node n1 = new Node();
        //n1.data = x;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        n1.data = x;
        if(top == null) {
            top = n1;
        } else {
            n1.next = top;
            top = n1;
        }
    }

    public void pop() {
        //System.out.println(top.data);
        Node n = top;
        if(top == null) {
            System.out.println("Stack is underflow.");
        } else {
            top = top.next;
            System.out.println(n.data);
            n.next = null;
        }
    }

    public void display() {
        Node n = top;
        if(top == null) {
            System.out.println("Stack is empty.");
        } else {
            while(n != null) {
                System.out.println(n.data);
                n = n.next;
            }
        }
    }

}

class LStackMain {
    public static void main(String[] args) {
        int n = 1;
        LStack s = new LStack();

        Scanner sc = new Scanner(System.in);

        while(n == 1) {
            System.out.println("*****Enter your choice*****");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");

            int ch = sc.nextInt();

            switch(ch) {
                case 1 : System.out.println("Enter your element which you want to push: ");
                    s.push();
                    break;
                case 2 : System.out.println("Element which you want to pop is: ");
                    s.pop();
                    break;
                case 3 : System.out.println("Element of stack is:");
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