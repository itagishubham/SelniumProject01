package JavaAsscociation.org.college;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College {

 public static void main(String[] args) {
	
	 Student st1 = new Student("Hanu", 2, "1", 2020);
	 Student st2 = new Student("Ramu", 2, "1", 2020);
	 Student st3 = new Student("Sham", 2, "1", 2020);
	 Student st4 = new Student("Kirti",2, "1", 2020);
	 Student st5 = new Student("Shiv", 2, "1", 2020);
	 Student st6 = new Student("Shambu", 2, "1", 2020);
	 Student st7 = new Student("Shiva", 2, "1", 2020);
	 
	 List<Student> stl1 = new ArrayList<Student>();
	 stl1.add(st1);
	 stl1.add(st2);
	 stl1.add(st3);
	 
	 List<Student> stl2 = new ArrayList<Student>();
	 stl2.add(st4);
	 stl2.add(st5);
	 stl2.add(st6);
	 stl2.add(st7);
	 
	 Teacher tech = new Teacher("Brahma", "Life", stl2);
	 Teacher tech2 = new Teacher("Suraya", "Begining", stl1);
	 
	 tech.asscociatedStudents();
	 tech2.asscociatedStudents();
	 
	 
	 
	 
	 
	 
    }
 
 
 public void studentAdmission()
 {
	Scanner sc = new Scanner(System.in );
	System.out.println("Welcome to college Sanatan");
	System.out.println("please fill the below form for student admission .. ");
	
	
 }
 



}
