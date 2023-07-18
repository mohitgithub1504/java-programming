class Room
{
  int l;
  int b;
  Room(int x,int y)
  {
    l=x;
	b=y;
  }
  int area()
  {
    return(l*b);
  }
}
class Room1 extends Room
{
  int h;
  Room1(int x,int y,int z)
  {
    super(x,y);
	h=z;
  }
  int volume()
  {
    return(l*b*h);
  }
}
class Calculate
{
  public static void main(String args[])
  {
    Room1 R1 = new Room1(10,20,30);
	int area = R1.area();
	int volume = R1.volume();
	System.out.println("Area is:" +area);
    System.out.println("Volume is:" +volume);
  }
}