package customeexceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//} = + ] ' " //
public class ReadFileDemo {
	public static void main(String[] args) {
		FileReader reader=null;
		try{
			reader=new FileReader("C:\\demo.txt");
			// logic to read a file
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			}
			finally{
				// using finally block
				try{
					reader.close();
				}
				catch(IOException e ){
					e.printStackTrace();
					
			}
			
		}
		
		
	}

}
