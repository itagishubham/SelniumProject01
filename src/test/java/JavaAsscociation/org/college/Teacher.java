package JavaAsscociation.org.college;

import java.util.List;

public class Teacher {
	
	String teacherName ;
	String subject ;
	List<Student> assStudent ;
	public Teacher(String name , String sub , List<Student> assStudent)
	{
		this.teacherName= name ; 
		this.subject = sub ;
		this.assStudent = assStudent;
	}
	
 

public void asscociatedStudents()
  {
	  for(Student st : assStudent )
	  {
		  System.out.println(st.name);
	  }
  }

}
