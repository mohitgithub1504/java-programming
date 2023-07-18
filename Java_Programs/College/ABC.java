class Addition
{
  public int add(int a, int b)
  {
    int sum1 = a+b;
	return sum1;
  }
  public float add(float a, float b)
  {
    float sum2 = a+b;
	return sum2;
  }
}
class ABC
{
  public static void main(String args[])
  {
    Addition ob = new Addition();
	float sum1 = ob.add(1,2);
	System.out.println("sum is:"+sum1);
	
	int sum2 = ob.add(1,2);
	System.out.println("sum is:"+sum2);
  }
}
   