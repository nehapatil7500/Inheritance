package assignment_inh;

class vehicle{
	
	void start()
	{
		System.out.println("vehicle");
	}
}
class fourwheeler extends vehicle{
	 
	void start()
	{
		super.start();
		System.out.println("four wheeler");
	}
}

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fourwheeler f=new fourwheeler();
		f.start();
	}

}
