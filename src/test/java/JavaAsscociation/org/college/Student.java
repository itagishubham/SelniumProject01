package JavaAsscociation.org.college;

public class Student {
	
	String name ; 
	int    age ; 
	String standard ; 
	int    yoA ; 
	
	Student(String name , int age , String standard, int yoa)
	{
		this.name=name;
		this.age=age;
		this.standard=standard;
		this.yoA=yoa;	
	}
	
	public String getDetails()
	{
		return  this.name+this.age+this.standard+this.yoA;
	}
	
	
	
	
	

}
