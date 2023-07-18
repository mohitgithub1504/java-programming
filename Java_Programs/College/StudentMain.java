import mca.Student;
import java.util.*;
import java.lang.*;
import java.io.*;
class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String n = sc.next();

        System.out.println("Enter Roll No: ");
        int r = sc.nextInt();

        System.out.println("Enter Marks: ");
        int math = sc.nextInt();
        int phy = sc.nextInt();
        int chem = sc.nextInt();

        System.out.println("--------------------------------------");

        Student s = new Student(r, n, math, phy, chem);
        s.display();
    }
}