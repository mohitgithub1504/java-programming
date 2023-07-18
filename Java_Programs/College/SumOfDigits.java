public class SumOfDigits
{
 public static void main(String args[])
 {
  int number = 12345;
  int digit,sum = 0;
  
  
  while(number>0)
  {
    digit = number%10;
	sum = sum+digit;
	number = number/10;
  }
   System.out.println("Sum of digits:"+sum);
 }
}
   
  