/*Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.*/

package assignment_inh;

class parent1{
	void display1()
	{
		System.out.println("parent1");
	}
	
}
interface parent2{
	void display();
}
class child extends parent1 implements parent2
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("parent2");
	}
	
	
}

public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.display();
		c.display1();
	}

}
