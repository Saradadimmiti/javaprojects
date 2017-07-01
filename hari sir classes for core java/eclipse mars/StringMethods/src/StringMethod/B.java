package StringMethod;


//} = + ] ' " //
public class B {
	public static void main(String[] args) {
		String s="banglore is nice city";
		String[]  x=s.split(" ");
		//splitting a sentence and inserting into a string array as words
		for (int i = x.length-1;i>=0; i--) {
			char[] y=x[i].toCharArray();
			//splitting a word into charectors and inserting into achar array
			for (int j=y.length-1;j>=0;j--)      {
				//reversing a sentence
				System.out.print(y[j])
				;
				
			}
			
		}

	}
}


