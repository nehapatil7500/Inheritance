/* Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.*/

package assignment_inh;

class base1{
	int a;
	base1(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	
}
class sub1 extends base1{
	int b,c,d;
	sub1()
	{
		super(10);
		System.out.println("sub class default");
	}
	sub1(int b)
	{
		super(10);
		this.b=b;
		System.out.println(b);
	}
	sub1(int c,int d)
	{ 
		super(10);
		this.c=this.d;
		System.out.println(b);
	}
		
	}


public class question8 {
	public static void main(String[] args)
	{
		sub1 s=new sub1();
		
	}

}
