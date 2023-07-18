import java.util.*;

class DoubleEndedQueue {
    int que[] = new int[10];
    int rear, front;
    void initialize(){
        rear = -1;
        front = -1;
    }
 
    void output_deque() {
       int n = 1;
       while(n == 1) {
            System.out.println("*****OUTPUT RESTRICTED DEQUE*****");
            System.out.println("1. Insert at right");
            System.out.println("2. Insert at left");
            System.out.println("3. Display");
            System.out.println("4. Exit");  
        
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

        switch(ch) {
            case 1 : System.out.print("insert at right: ");
                     insert_rear();
            break;
            case 2 : System.out.print("insert at left: ");
                     insert_front();
            break;
           
            case 3 : System.out.println("Elements of deque is:");
                     display();
            break;
            case 4 : System.out.println("Wrong Choise.");;
            return;
        }
        System.out.println("To be continue press 1.");
        n = sc.nextInt();
       }
    }
    int empty(){
        if(front == -1){
            return 1;
        } else {
            return 0;
        }
    }
    int full(){
        if((front == 0 && rear == 9) || (front == rear+1)){
            return 1;
        } else {
            return 0;
        }
    }
    
    void insert_front(){
        int flag = full();
        if(flag == 0) {
            if(front == -1) {
                front = 0;
                rear = 0;
            } else {
                if(front == 0){
                    front = 9;
                } else {
                    front = front-1;
                }
            }
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            //rear++;
            que[front] = x;
        } else {
            System.out.println("Queue is overflow.");
        }
    }
    void insert_rear(){
        int flag = full();
        if(flag == 0) {
            if(front == -1) {
                front = 0;
                rear = 0;
            } else {
                if(rear == 9){
                    rear = 0;
                } else {
                    rear = rear+1;
                }
            }
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            //rear++;
            que[rear] = x;
        } else {
            System.out.println("Queue is overflow.");
        }
    }

    
    void display(){
        int flag = empty();
        if(flag == 0) {
            if(rear>=front) {
                for(int i=front; i<=rear; i++) {
                    System.out.println(que[i]);
                } 
            } else {
                for(int i=front ; i<10 ;i++) {
                    System.out.println(que[i]);
                }

                for(int i=0; i<=rear; i++){
                    System.out.println(que[i]);
                }
            }
        } else {
            System.out.println("Queue is underflow.");
        }
    }
}

class Practicle {
    public static void main(String[] args) {
        int n = 1;
        DoubleEndedQueue s = new DoubleEndedQueue();
        s.initialize();
        
        Scanner sc = new Scanner(System.in);
    
        while(n == 1) {
            System.out.println("*****MAIN MENU*****");
            System.out.println("1. Output Restricted Deque");
            System.out.println("2. EXIT");  
            
            int ch = sc.nextInt();

        switch(ch) {
          
            case 1 : s.output_deque();
            break;
            case 2 : System.out.println("Wrong Choise.");
            return;
        }
    
        System.out.println("To be continue press 1.");
        n = sc.nextInt();
        }
    }
}