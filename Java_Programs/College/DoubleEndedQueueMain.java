import java.util.*;

class DoubleEndedQueue {
    int que[] = new int[10];
    int rear, front;
    void initialize(){
        rear = -1;
        front = -1;
    }
    void input_deque() {
        int n = 1;
        while(n == 1) {
            System.out.println("*****INPUT RESTRICTED DEQUE*****");
            System.out.println("1. Insert at right");
            System.out.println("2. Delete from left");
            System.out.println("3. Delete from right");
            System.out.println("4. Display");
            System.out.println("5. Exit");  
        
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

        switch(ch) {
            case 1 : System.out.println("Enter your element which you want to insert at right: ");
                     insert_rear();
            break;
            case 2 : System.out.println("Element which you want to delete from left is: ");
                     delete_front();
            break;
            case 3 : System.out.println("Element which you want to delete from right is: ");
                     delete_rear();
            break;
            case 4 : System.out.println("Elements of deque is:");
                     display();
            break;
            case 5 : System.out.println("Wrong Choise.");;
            return;
        }
        System.out.println("To be continue press 1.");
        n = sc.nextInt();
        }
    }
    void output_deque() {
        int n = 1;
        while(n == 1) {
            System.out.println("*****OUTPUT RESTRICTED DEQUE*****");
            System.out.println("1. Insert at right");
            System.out.println("2. Insert at left");
            System.out.println("3. Delete from left");
            System.out.println("4. Display");
            System.out.println("5. Exit");  
        
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

        switch(ch) {
            case 1 : System.out.println("Enter your element which you want to insert at right: ");
                     insert_rear();
            break;
            case 2 : System.out.println("Enter your element which you want to insert at left: ");
                     insert_front();
            break;
            case 3 : System.out.println("Element which you want to delete from left is: ");
                     delete_front();
            break;
            case 4 : System.out.println("Elements of deque is:");
                     display();
            break;
            case 5 : System.out.println("Wrong Choise.");;
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
    void delete_front(){
        int flag = empty();
        if(flag == 0) {
            System.out.println(que[front]);
            if(front == rear) {
                initialize();
            } else {
                if(front == 9) {
                    front = 0;
                } else {
                    front = front+1;
                }               
            }
        } else {
            System.out.println("Queue is underflow.");
        }
    }
    void delete_rear(){
        int flag = empty();
        if(flag == 0) {
            System.out.println(que[rear]);
            if(front == rear) {
                initialize();
            } else {
                if(rear == 0) {
                    rear = 9;
                } else {
                    rear = rear-1;
                }               
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

class DoubleEndedQueueMain {
    public static void main(String[] args) {
        int n = 1;
        DoubleEndedQueue s = new DoubleEndedQueue();
        s.initialize();
        
        Scanner sc = new Scanner(System.in);
    
        while(n == 1) {
            System.out.println("*****MAIN MENU*****");
            System.out.println("1. Input Restricted Deque");
            System.out.println("2. Output Restricted Deque");
            System.out.println("3. EXIT");  
            
            int ch = sc.nextInt();

        switch(ch) {
            case 1 : //System.out.println("Enter your element which you want to insert first: ");
                     s.input_deque();
            break;
            case 2 : //System.out.println("Enter your element which you want to insert last: ");
                     s.output_deque();
            break;
            case 3 : System.out.println("Wrong Choise.");
            return;
        }
    
        System.out.println("To be continue press 1.");
        n = sc.nextInt();
        }
    }
}