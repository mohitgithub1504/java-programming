import java.util.*;
class LinearSearch
{
  int a[]=new int[10];
  void input()
  {
    Scanner S = new Scanner(System.in);
	System.out.println("Enter the values:");
	
	for(int k=0;k<10;k++)
	{
	  a[k]=S.nextInt();
	}
   }
   void search()
   {
	   Scanner S = new Scanner(System.in);
	   System.out.println("Enter the search value:");
	   int x = S.nextInt();
	   int i;
     for(i=0;i<10;i++)
	 {
		  if(a[i] == x)
		  {
			  System.out.println(x+" is present at the location "+ (i+1));
			  break;
		  } 
	 }
	 
	 if(i == 10){
		 System.out.println(x+" is not present at any location.");
	 }
   }
}

class Searching
{
  public static void main(String []args)
  {
    LinearSearch ob = new LinearSearch();
	ob.input();
	ob.search();
  }
}

		