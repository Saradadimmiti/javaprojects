package exceptionhandling;
//} = + ] ' " //
import java.io.FileReader;
import java.io.FileNotFoundException;

//} = + ] ' " //
public class E {
	public static void main(String[] args) {
		try{
			System.out.println("A");
			FileReader fr=new FileReader("C:\\demo.txt");
			// file is not present
		}
		catch(FileNotFoundException e){
			System.out.println("file not found");
			// catch block is excecuted
		}
	}

}
