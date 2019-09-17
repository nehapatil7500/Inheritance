package assignment_inh;

class person
{
	int a=10;
	person(int a)
	{
		this.a=a;
		System.out.println(a);
	}
}
class emp1 extends person{
	
	int b=20;
	emp1()
	{
		super(10);
		System.out.println("default child class constructor");
	}
	emp1(int b)
	{
		super(10);
		this.b=b;
		System.out.println(b);
	}
}
class emp2 extends person{
	int c=30;
	emp2()
	{
		super(10);
		System.out.println("default child class constructor");
	}
	emp2(int c)
	{
		super(10);
		this.c=c;
		System.out.println(c);
	}
	
}
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp2 e=new emp2();
	}

}
