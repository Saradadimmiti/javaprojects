package StringBuffer;
//} = + ] ' " //
public class E {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("unhappy");
		s.delete(0, 2);
		// excludeing ending index
		System.out.println(s);
	}

}
