import java.util.*;

public class Even {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        //for(int i = 1; i <= n; i++) {
           // if(i%2 == 0)
            //{
            //    System.out.println(i);
           // } 
       // }
        int i = 1;
        //while(i <= n) {
         //   if(i%2 == 0){
        //        System.out.println(i);
        //    }
        //    i++;
        // }
        do {
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        } while(i <= n);
    }
}    

