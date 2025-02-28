package AbstractionAndInterface;

abstract class Vehicle{
   public abstract void show();
   public void show1() {
	   System.out.println("boom boom");
   }
}

class Car extends Vehicle{
	
	public void show() {
		System.out.println("Tata safari");
	   }
	}
	
	


public class Main {
	public static void main(String args[]) {
		
		Car obj=new Car();
		obj.show();
		obj.show1();
	}

}
