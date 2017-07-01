package customeexceptions;
import java.io.FileReader;
//} = + ] ' " //
public class TryAndResource {
	public static void main(String[] args) {
		try(FileReader reader1=new FileReader("C:\\demo.txt");FileReader reader2=new FileReader("C:\\hello.txt")){			// try with resource
		}
		// using multiple resources
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
