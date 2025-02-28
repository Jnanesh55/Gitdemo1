package calci;

public class Main {
	public static void main(String ags[])
	{
		VeryAdvCalc obj=new VeryAdvCalc();
		int r1=obj.add(5, 6);
		int r2=obj.sub(7,4);
		
		
		//AdvCalc obj1=new AdvCalc();
		
		int r3=obj.mul(5, 6);
		int r4=obj.div(20,3);
		int r5=obj.power(7,2);
		
		System.out.println(r1+"  "+r2+" "+r3+" "+r4+" "+r5);
	}

}
