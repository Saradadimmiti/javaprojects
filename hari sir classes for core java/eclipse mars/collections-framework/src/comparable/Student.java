package comparable;

import java.util.Set;
import java.util.TreeSet;

//} = + ] ' " //
public class Student implements Comparable<Student>{
	String name;
	int rollNo;
	 public Student(int rollNo,String name){
		 this.rollNo=rollNo;
		 this.name=name;
	 }
	 public static void main(String[] args) {
		Set<Student> students=new TreeSet<>();
		students.add(new Student(1,"Hari"));
		students.add(new Student(5,"Raghu"));
		students.add(new Student(4,"Sita"));
		students.add(new Student(4,"Gita"));
		students.add(new Student(3,"Abhilash"));
		for (Student std: students) {
			System.out.println(std.name+""+std.rollNo);
			
		}
		
	}
	 public int compareTo(Student x){
		 return this.name.compareTo(x.name);
	 }

}
