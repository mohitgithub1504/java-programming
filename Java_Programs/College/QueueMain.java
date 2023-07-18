import java.util.*;

class Queue {
    int que[] = new int[10];
    int rear, front;
    void initialize(){
        rear = -1;
        front = -1;
    }
    int empty(){
        if(rear == -1){
            return 1;
        } else {
            return 0;
        }
    }
    int full(){
        if(rear == 9){
            return 1;
        } else {
            return 0;
        }
    }
    void enque(){
        int flag = full();
        if(flag == 0) {
            if(front == -1) {
                front++;
            }
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            rear++;
            que[rear] = x;
        } else {
            System.out.println("Queue is overflow.");
        }
    }
    void deque(){
        int flag = empty();
        if(flag == 0) {
            int x = que[front];
            front++;
            System.out.println(x);
        } else {
            System.out.println("Queue is underflow.");
        }
    }
    void display(){
        int flag = empty();
        if(flag == 0) {
            for(int i=front; i<=rear; i++) {
                System.out.println(que[i]);
                //System.out.println(front);
                //System.out.println(rear);
            }
        } else {
            System.out.println("Queue is underflow.");
        }
    }
}

class QueueMain {
    public static void main(String[] args) {
        int n = 1;
        Queue s = new Queue();
        s.initialize();
        
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