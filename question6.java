package assignment_inh;

interface A{
	void disp1();
}
interface B extends A
{
	void disp2();
}
class c implements B
{

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}
	
}
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c c=new c();
		c.disp1();
		c.disp2();
		
	}

}
