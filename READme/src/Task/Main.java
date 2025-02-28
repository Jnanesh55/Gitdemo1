package Task;

import java.time.LocalDate;

class Employee {
	
	String name;
	int age;
	LocalDate dob;
	String id;
	
	
	public void show() {
		System.out.println(name+'\n'+age+'\n'+dob+'\n'+id);
	}
}

class Manager extends Employee {
	String team;
	public void show1() {
		System.out.println(team+'\n');
	}

	/* public String show1() {
		 team=null;
		 return team;
		 
	 }*/
	
}


public class Main {
     public static void main(String args[]) {
    	 Manager Manager1=new Manager();
    	 Employee Employee1=new Employee();
    	 
    	 Employee1.name="jnanesh";
    	 Employee1.age= 21;
    	 Employee1.dob= LocalDate.of(2003, 9, 7) ;        
    	 Employee1.id="BEQ1234";
    	 
    	 Manager1.team = "Development" ;
    	 
    	 Employee1.show();
    	 Manager1.show1();
    	
         Employee Employee2=new Employee();
    	 
    	 Employee2.name="abhi";
    	 Employee2.age= 21;
    	 Employee2.dob= LocalDate.of(2003, 7, 1);           
    	 
    	 Manager1.team = "Testing" ;
    	 
    	 
    	 Employee2.show();
    	 Manager1.show1();
    	 
    	 Manager1.team=null;
    	// Manager1.show1();
    	 
    	 Employee1.show();
    	 Employee2.show();
     }
     
     
     
}
