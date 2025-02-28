package encapsuleDemo;

public class human {
	private int age;
	   private String name;
	   
	   public human() {   //defualt constructor
		   age=21;
		   name="jnanesh";
	   }
	   
	   public human(int a,String n) {
		   age=a;
		   name=n;
	   }
		
	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}

	public void setAge(int x) {
		this.age=x;
		
	}
	public void setName(String y) {
		this.name=y;
		
	}
}
