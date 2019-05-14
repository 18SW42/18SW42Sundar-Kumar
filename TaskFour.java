class TaskFour
{
	public void same(int lenght , int breadth)
	{
		System.out.println("the area of rectangle is="+(lenght*breadth));
	}
	public void same(int area)
	{
	System.out.println("the area of sqaure is="+(area*area));
	}

}

class TaskFourMain
{
	public static void main(String[] args) 
	{
		TaskFour obj1=new TaskFour();
		obj1.same(4,12);
		obj1.same(4);
	}
}