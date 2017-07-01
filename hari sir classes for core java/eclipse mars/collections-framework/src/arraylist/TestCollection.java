package arraylist;

import java.util.*;

//} = + ] ' " //
public class TestCollection {
	public static void main(String[] args) {
		Student s1=new Student("rama",20,1);
		Student s2=new Student("sita",21,2);
		Student s3=new Student("lakshman",18,3);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator itr=al.iterator();
		
		
		
		while(itr.hasNext()){
			Student st=(Student)itr.next();
			System.out.println(st.rollnumber+" "+st.name+" "+st.age);}}}
			


