class TaskSix
{
	public static void add(int a,int b)
	{
	System.out.println("The addition of "+a+" and "+b+" is "+(a+b));
	}
}
class TaskSixMain
{
	public static void main(String[] args) 
	{
		TaskSix.add(12,10); //We cannot make object when we use static keyword.
	}
}
