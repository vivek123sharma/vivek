package Package_1;

public class Class_1 {
	
	public Class_1() 
	{
		this(77,88,99);
		System.out.println("Default Constructor");
	}
	public Class_1(int a) 
	{
		this(11,22,33,44);
		System.out.println("One Parameterized Constructor");
	}
	public Class_1(int a,int b) 
	{
		this();
		System.out.println("Two Parameterized Constructor");
	}
	public Class_1(int a,int b,int c) 
	{
		System.out.println("Three Parameterized Constructor");
	}
	public Class_1(int a,int b,int c,int d) 
	{
		this(55,66);
		System.out.println("Four Parameterized Constructor");
	}
	

	public static void main(String[] args) 
	{
		Class_1 obj = new Class_1(11);

	}

}
