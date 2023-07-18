import java.util.Scanner;
class PrimeNumber
{
  public static void main(String args[])
  {
    int temp=0;
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int number = sc.nextInt();
	
	for(int i=2;i<=number-1;i++)
	{
	  if(number%i==0)
	  {
	     temp = temp+1;
	  }
	}
	if(temp==0)
	{
	   System.out.println(number+" is prime number");
	}
	else
	{
	   System.out.println(number+" is not prime number");
	}
  }
}
   
	