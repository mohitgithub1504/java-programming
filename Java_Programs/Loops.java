import java.util.*;

public class Loops{
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number: ");
        //int n = sc.nextInt();
        //int sum = 0;
        //for(int i = 1; i <= n; i++){
        //    sum = sum + i;
        //}
        //System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(n+"*"+i+"="+ n*i);
        }
    }
}