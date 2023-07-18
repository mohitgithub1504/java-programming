import java.util.Scanner;
class Employee
{ 
  int number;
  String name;
  float salary;
  
  public void getdata()
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	number = sc.nextInt();
	
	System.out.println("Enter the name:");
	name = sc.next();
	
	System.out.println("Enter the salary:");
	salary = sc.nextFloat();
  }
  public void putdata()
  {
    System.out.println("Employee Number:" +number);
	System.out.println("Employee Name:" +name);
	System.out.println("Employee Salary:" +salary);
  }
  public void increment()
  {
	  float inc = (salary * 20)/100;
	  float total = salary + inc;
	  System.out.println("Salary after 20% of increment:" +total);
  }
}
class ShowDetails
{
  public static void main(String args[])
  {
    Employee ob = new Employee();
	ob.getdata();
	
	System.out.println("**** Data Entered as below ****");
	
	ob.putdata();
	ob.increment();
  }
}

