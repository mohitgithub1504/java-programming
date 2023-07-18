import java.util.*;

public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the operation: ");
        int operation = sc.nextInt();
        switch(operation){
        case 1 : int add = a+b;
                 System.out.println(add);
        break;
        case 2 : int sub = a-b;
                 System.out.println(sub);
        break;
        case 3 : int mul = a*b;
                 System.out.println(mul);
        break;
        case 4 : if (b == 0){
                    System.out.println("Invalid Division");
                }else {
                    int div = a/b;
                    System.out.println(div);
                }
        break;
        case 5 : if (b == 0){
                    System.out.println("Invalid Division");
                }else { 
                    int mod = a%b;
                    System.out.println(mod);
                }
        break;
        }

    }
}