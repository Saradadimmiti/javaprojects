package StringMethod;


//} = + ] ' " //
public class C {
	public static void main(String[] args) {
		String s="banglore is nice city";
		String[]  x=s.split(" ");
		//splitting a sentence and inserting into a string array as words
		for(int i=0;i<x.length;i++)  {
			char[] y=x[i].toCharArray();
			//splitting a word into charectors and inserting into achar array
			for (int j=y.length-1;j>=0;j--)      {
				//reversing each word in a sentence without changing placeof the word 
				System.out.println(y[j])
				;
				
			}
			
		}

	}
}




