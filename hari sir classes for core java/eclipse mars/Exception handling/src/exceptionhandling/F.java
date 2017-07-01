package exceptionhandling;
import java.io.FileReader;
import java.io.FileNotFoundException;


//} = + ] ' " //



public class F {
	public static void main(String[] args) {
		try{
			System.out.println("A");
			FileReader fr=new FileReader("C:\\Demo.txt");
			System.out.println("B");
			// file is present
		}
		catch(FileNotFoundException e){
			System.out.println("file not found");
			//catch block is not excecuted
		}
	}

}



