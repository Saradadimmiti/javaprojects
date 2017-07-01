package map;
import java.util.HashMap;
//} = + ] ' " //
import java.util.Map;

public class A {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("Ravi", "Banglore");
		map.put("Raju", "Tirupathi");
		map.put("Raghu", "Hyderabad");
		map.put("Sita", "Delhi");
		map.put("Amar", "Banglore");
		System.out.println(map.get("Ravi"));
		System.out.println(map.get("Raju"));
		System.out.println(map.get("Raghu"));
		System.out.println(map.get("Sita"));
		System.out.println(map.get("Amar"));
		
	}

}
