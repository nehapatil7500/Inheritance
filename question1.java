/* Create a multi-level inheritance , instantiate the child class and observe constructor invocation.
Also show, if needed how will u invoke parent class constructor from child class ?*/

package assignment_inh;

class a{
	int a;
	void show2()
	{
		System.out.println("b class");
	}
	a(int a)
	{
		this.a=a;
		System.out.println(a);
	}
}
class b extends a{
	int b;
		void show3()	
		{
			System.out.println("b class");
		}
		b()
		{
			super(10);
			System.out.println("b class default constructor");
		}
		b(int b)
		{
		super(10);
		this.b=b;
		System.out.println(b);
		}
}

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			b b=new b();
			b.show3();
			b.show2();
			
	}

}
