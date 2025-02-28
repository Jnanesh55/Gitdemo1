package innerclass;

class First{
	int x=4;
	
 class Second  extends First     //  If we use private keyword then it cannot be accessed by object
 {
	int y=6;
}
 

 
 /*private class Second  extends First     //  If we use private keyword then it cannot be accessed by object
 {
	int y=6;
}*/
 
 
}

public class Main {
	
	public static void main(String args[]) {
		
	First obj = new First();
	First.Second obj1=  obj.new Second();
	System.out.println(obj.x+" "+obj1.x);    //obj1 can accsess attribute from class first

	
	}

}
