package encapsuleDemo;


public class main {
	public static void main(String args[])
	 {
		 human obj=new human();
		// obj.setAge(21);
		// obj.setName("jnanesh");
		 
		 
		 human obj1=new human(30,"abhi");
		 
		 System.out.println("AGE:"+obj.getAge() +"  " + "NAME:" +obj.getName());
		 System.out.println("AGE:"+obj1.getAge() +"  " + "NAME:" +obj1.getName());
	 }
}
