package comparator;
//} = + ] ' " //
import java.util.Set;
import java.util.TreeSet;

public class StudentTest {
	public static void main(String[] args) {
		Set<Student> std=new TreeSet<>(new SortByNameComparator());
		std.add(new Student(1,"Rama"));
		std.add(new Student(2,"Sita"));
		std.add(new Student(4,"Rahul"));
		std.add(new Student(5,"Naveen"));
		std.add(new Student(7,"Amar"));
		for (Student s: std) {
			System.out.println("Name" +s.name +"rollNo" +s.rollNo);
			
		}
	}

}
