//} = + ] ' " //
public class V  {
	public static void main(String[] args) {
		String s="banglore";
		char[] x = s.toCharArray();
		//creating a char array to store each charector in string
		// for retriving each letter in string in reverse order
		String s1="";
		for (int i = x.length-1;i>=0; i--) {
			s1=s1+(x[i]);

		}
		// getting theletter in reverse order
		System.out.println(s1);
	}

}

