import java.util.*;

class Stack {
    int stk[] = new int[10];
    int top;
    void initialize(){
        top = -1;
    }
    int empty(){
        if(top == -1){
            return 1;
        } else {
            return 0;
        }
    }
    int full(){
        if(top == 9){
            return 1;
        } else {
            return 0;
        }
    }
    void push(){
        int flag = full();
        if(flag == 0) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            top++;
            stk[top] = x;
        } else {
            System.out.println("Stack is overflow.");
        }
    }
    void pop(){
        int flag = empty();
        if(flag == 0) {
            int x = stk[top];
            top--;
            System.out.println(x);
        } else {
            System.out.println("Stack is underflow.");
        }
    }
    void display(){
        int flag = empty();
        if(flag == 0) {
            for(int i=0; i<=top; i++) {
                System.out.println(stk[i]);
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }
}

class StackMain {
    public static void main(String[] args) {
        int n = 1;
        Stack s = new Stack();
        s.initialize();
        
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
