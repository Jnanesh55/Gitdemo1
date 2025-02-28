package calci;


class A{
	public void show() {
		System.out.println("Shows A");
	}
}
class B extends A{
	public void show() {
		System.out.println("Shows B");
	}
}
class C extends A{
	public void show() {
		System.out.println("Shows C");
	}
}



public class PolyMor {
	
	public static void main(String args[]) {
		
		A obj=new A();
		obj.show();
		
		obj=new B();
		obj.show();
		                  //obj.show acts differently for different objects this is polymorfism
		
		obj=new C();
		obj.show();
	}
	

}
