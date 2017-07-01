package comparator;

import java.util.Comparator;

public class SortByRollNoComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s1.rollNo.compareTo (s2.rollNo);
	}

}
