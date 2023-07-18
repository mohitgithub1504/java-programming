import java.util.*;
public class ExceptionHandle {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        try {
            for(int i=0; i<=a.length; i++) {
                System.out.println(a[i]);
            }
        } catch (Exception e) {
            System.out.println("Exception caugth");
        }
    }
}