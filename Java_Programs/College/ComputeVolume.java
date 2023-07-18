class Volume
{
  int width;
  int height;
  int depth;
  int vol;
  
  void compute()
  {
	  vol = width*height*depth;
	System.out.println("Volume is =" +vol);
  }
}
class ComputeVolume
{
  public static void main(String args[])
  {
    Volume ob = new Volume();
	
	ob.width = 30;
	ob.height =15;
	ob.depth = 20;
	
	ob.compute();
	
	
   }
}