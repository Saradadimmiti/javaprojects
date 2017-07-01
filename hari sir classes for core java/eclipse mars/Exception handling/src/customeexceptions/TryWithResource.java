package customeexceptions;
import java.io.FileReader;
//} = + ] ' " //
public class TryWithResource {
	public static void main(String[] args) {
		try(FileReader reader=new FileReader("C:\\hello.txt")){
			// try with resource
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
