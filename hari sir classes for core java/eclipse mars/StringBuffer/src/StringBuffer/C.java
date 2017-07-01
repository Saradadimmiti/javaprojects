package StringBuffer;
//} = + ] ' " //
public class C {
public static void main(String[] args) {
	StringBuffer s=new StringBuffer("java");
	s.append(123);  // appending an integer
	s.append('m');  //  appending a char
	s.append(10.5);  //  appending a float
	s.append("home");//  appending a string
	s.append(true);   //  appending a boolean
	System.out.println(s);
}
}

