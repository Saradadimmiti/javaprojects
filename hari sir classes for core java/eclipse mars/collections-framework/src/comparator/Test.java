package comparator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//} = + ] ' " //
public class Test {
	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in)){
			System.out.println("Sort by name ?");
			boolean sortByName=scn.nextBoolean();
			Set<Student> std;
			if(sortByName){
				std=new TreeSet<>(new SortByNameComparator());
			}
			else{
				std=new TreeSet<>(new SortByRollNoComparator());
			}
			std.add(new Student(1,"Shiva"));
			std.add(new Student(3,"Sarada"));
			std.add(new Student(1,"Usha"));
			std.add(new Student(1,"Naveen"));
			std.add(new Student(1,"Rahul"));
			for (Student s : std) {
				System.out.println("Name"+s.name+"RollNo"+s.rollNo);
			}
			
		}
	}

}
