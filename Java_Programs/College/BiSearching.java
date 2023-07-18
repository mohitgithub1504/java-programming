import java.util.*;
class BinarySearch 
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
    //int low = 0;
    //int high = 9;
	   Scanner S = new Scanner(System.in);
	   System.out.println("Enter the search value:");
	   int x = S.nextInt();
       
     int low = 0;
     int high = 9;
        int mid = (low+high)/2;

       while(low <= high){

      // int mid = (low+high)/2;
       
       if(a[mid] < x) {
        low = mid+1;
       } else if(a[mid] == x) {
        System.out.println(x+" is present at the location "+mid);
        break;
       } else {
           high = mid-1;
       }
       mid = (low+high)/2;
    } 
      if(low > high) {
        System.out.println(x+" is not present at any location.");
    } 
   }
}

class BiSearching
{
  public static void main(String []args)
  {
    BinarySearch ob = new BinarySearch();
	ob.input();
	ob.search();
  }
}