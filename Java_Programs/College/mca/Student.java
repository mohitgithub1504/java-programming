package mca;

public class Student {
    int roll_no;
    String name;
    int a,b,c;
    int sum = 0;
    public Student(int r, String n, int math, int phy, int chem) {
         roll_no = r;
         name = n;
         a = math;
         b = phy;
         c = chem;
         sum = a+b+c;
    }
    public void display() {
        System.out.println("Roll_no :" +roll_no);
        System.out.println("Name :" +name);
        System.out.println("-----MARKS-----");
        System.out.println("MATHS :" +a);
        System.out.println("PHYSICS :" +b);
        System.out.println("CHEMISTRY :" +c);
        System.out.println("Total :" +sum);
        System.out.println("------------------------------");
    }
} 