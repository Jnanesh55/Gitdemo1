package AbstractionAndInterface;

/*interface Vehicle1{
	
	public void carname();
	public void sound();
	
}*/

class Car1 //implements Vehicle1
{
	
	public void carname() {
		System.out.println("BMW");
		
	}
	public void sound() {
		System.out.println("inlane 4");
	}
	
	
}
public class MainInterface {

	public static void main(String args[] ){
		
		Car1 obj =new Car1();
		obj.carname();
		obj.sound();
	}
}
