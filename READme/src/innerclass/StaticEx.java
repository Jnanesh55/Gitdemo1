package innerclass;

class A{
	
	
	public void show() {
		System.out.println("CLASS A SHOWN");
	}
	static class B{

		public void show1() {
			System.out.println("CLASS B SHOWN");//it can be directly acccessed without creating obj of class A		}
		
	}
		
}
}

public class StaticEx {

	 public static void main(String args[]) {
		 
		 A.B obj=new A.B();
		 
		 obj.show1();
		 
		 //obj.show();
		
	 }
}
	 
