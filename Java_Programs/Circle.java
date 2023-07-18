import java.util.*;
public class Circle{
    public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the radius:");
    //int r = sc.nextInt();
    // double pi = 3.14;
    // double area = (pi*(r*r));
    // System.out.println("Area of a circle is:" +area);

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int num = sc.nextInt();

      /** System.out.println(num+ "*" +1+ "=" +num*1);
       System.out.println(num+ "*" +2+ "=" +num*2);
       System.out.println(num+ "*" +3+ "=" +num*3);
       System.out.println(num+ "*" +4+ "=" +num*4);
       System.out.println(num+ "*" +5+ "=" +num*5);
       System.out.println(num+ "*" +6+ "=" +num*6);
       System.out.println(num+ "*" +7+ "=" +num*7);
       System.out.println(num+ "*" +8+ "=" +num*8);
       System.out.println(num+ "*" +9+ "=" +num*9);
       System.out.println(num+ "*" +10+ "=" +num*10);**/

       for(int i=1; i<=10; i++)
       {
           System.out.println(num+ "*" +i+ "=" +num*i);
       }

    }
}