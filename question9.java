/* create interface "Game" , have an abstract method "play()".
 *  from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter.
inside "perform()" see to it that any child object passed ,
its "play()" method should be invoked. Call "perform()" method from main function.
*/

package assignment_inh;

interface Game
{
	abstract void play();
}
class cricket implements Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("cricket");
	}
	
}
class football implements Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("football");
	}
	
}
class tennis implements Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("tennis");
	}
	
}
public class question9 {
	static void perform(Game g){
		g.play();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new cricket());
		perform(new football());
		perform(new tennis());
		

	}

}
