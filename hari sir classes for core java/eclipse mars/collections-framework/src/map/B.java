package map;
//} = + ] ' " //
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class B {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("Ravi", "Banglore");
		map.put("Raju", "null");
		map.put("Raghu", "Hyderabad");
		map.put("Sita", "Delhi");
		map.put("null", "Banglore");
		Set<String> keys=map.keySet();
		for (String key : keys) {
			System.out.println(key+"--->"+map.get(key));
			
		}

}
	}
