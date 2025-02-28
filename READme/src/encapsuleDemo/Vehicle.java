package encapsuleDemo;

public class Vehicle {

    protected String brandName="TATA";
	public void myMethod() {
		System.out.println("the car here is");
	}
}

 class Car extends Vehicle{
	private String model="Harrier";
	
	public static void main(String args[]) {
	
	Car obj=new Car();
	
	obj.myMethod();
	
	
	System.out.println(obj.brandName+"  "+obj.model);
	
	
}}