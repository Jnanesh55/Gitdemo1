package calci;

public class VeryAdvCalc extends AdvCalc{

	public int power(int x,int y) {
		
		return (int)Math.pow(x, y);
	}
	
	//overriding parameter 
	public int add(int x,int y) {
		return x+y+2;
	}
}
