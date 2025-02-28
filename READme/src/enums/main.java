package enums;

/*enum Level{
	LOW,
	MEDIUM,
	high;
}*/

public class main {
	enum Level{
		LOW,
		MEDIUM,
		high;
	}
	public static void main(String[] args) {
		Level var=Level.high;
		System.out.println(var);
		
		for(Level myvar:Level.values()){
			System.out.println(myvar);
		}
	}
	
}
