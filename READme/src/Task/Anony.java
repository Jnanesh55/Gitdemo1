package Task;

abstract class A{
	public abstract void show();
}
	
public class Anony{
	public static void main(String args[]){
		A obj = new A()
				{
			
			public void show() {
				System.out.println("Success");
			}
			
			};
				obj.show();
	}
}