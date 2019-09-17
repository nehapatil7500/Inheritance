/* create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.*/

package assignment_inh;

abstract class Shape{
	abstract void draw();
	
}
class circle extends Shape{
	void draw()
	{
	System.out.println("circle");}
}
class triangle extends Shape{
	void draw()
	{
	System.out.println("triangle");}
}
class polygon extends Shape{
	void draw()
	{
	System.out.println("polygon");}
}

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape arr[]=new Shape[3];
		arr[0]=new circle();
		arr[1]=new triangle();
		arr[2]=new polygon();
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].draw();
		}
		
		

	}

}
