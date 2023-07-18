import java.util.*;

class CircularQueue {
    int que[] = new int[10];
    int rear, front;
    void initialize(){
        rear = -1;
        front = -1;
    }
    int empty(){
        if(front == -1){
            return 1;
        } else {
            return 0;
        }
    }
    int full(){
        if(front == (rear+1)%10){
            return 1;
        } else {
            return 0;
        }
    }
    void enque(){
        int flag = full();
        if(flag == 0) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if(front == -1) {
                front++;
            }
                rear = (rear+1)%10;
                que[rear] = x;
        } else {
            System.out.println("Queue is overflow.");
        }
    }
    void deque(){
        int flag = empty();
        if(flag == 0) {
            System.out.println(que[front]);
            if(front == rear) {
                initialize();
            } else {
                int x = que[front];
                front = (front+1)%10;                
            }
        } else {
            System.out.println("Queue is underflow.");
        }
    }
    void display(){
        int flag = empty();
        if(flag == 0) {
            if(rear>=front) {
                for(int i=front; i<=rear; i++) {
                    System.out.println(que[i]);
                   //System.out.println(front);
                   //System.out.println(rear);
                } 
            } else {
                for(int i=front ; i<10 ;i++) {
                    System.out.println(que[i]);
                    //System.out.println(front);
                    //System.out.println(rear);
                }

                for(int i=0; i<=rear; i++){
                    System.out.println(que[i]);
                    //System.out.println(front);
                    //System.out.println(rear);
                }
            }
        } else {
            System.out.println("Queue is underflow.");
        }
    }
}

class CircularQueueMain {
    public static void main(String[] args) {
        int n = 1;
        CircularQueue s = new CircularQueue();
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
            case 4 : System.out.println("Wrong Choise.");;
            return;
        }
    
        System.out.println("To be continue press 1.");
        n = sc.nextInt();
        }
    }
}