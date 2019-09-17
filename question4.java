/* Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.*/

package assignment_inh;

class Top1{
	void disp1()
	{
		
	}
}
class Bottom1 extends Top1{
	void disp1()
	{
		System.out.println("bottom1");
	}
}
class Bottom2 extends Top1{
	void disp1()
	{
		System.out.println("bottom2");
	}
}
class Bottom3 extends Top1{
	void disp1()
	{
		System.out.println("bottom3");
	}
}


public class question4 {
	static void perform(Top1 t)
	{
		t.disp1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			perform(new Bottom1());
			perform(new Bottom2());
			perform(new Bottom3());
	}

}
