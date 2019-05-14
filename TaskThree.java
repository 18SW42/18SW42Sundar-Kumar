class TaskThree
{
	public void change(int n,char c)
	{
		System.out.println(n+" "+c);
	}
	public void change(char c,int n)
	{
		System.out.println(c+" "+n);
	}
}
class TaskThreeMain 
{
	public static void main(String[] args) 
	{
		TaskThree obj1=new TaskThree();
		obj1.change(5,'c');
		obj1.change('c',5);
	}
}