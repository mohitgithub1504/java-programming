class Box
{
  int width,height,depth,vol;
  Box(int w,int h,int d)
  {
    width = w;
	height = h;
	depth = d;
  }
  void volume()
  { 
    vol = width*height*depth;
	System.out.println("Volume is =" +vol);
  }
}

class Answer
{
  public static void main(String args[])
  {
    Box ob = new Box(10,20,15);
	ob.volume();
  }
}  