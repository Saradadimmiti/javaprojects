package hashcode;
//} = + ] ' " //
import java.util.HashSet;
import java.util.Set;

public class CarSet {
	public static void main(String[] args) {
		
	
	Set<Car> cars=new HashSet<>();
	cars.add(new Car("Audi",1111));
	cars.add(new Car("Innova",2222));
	cars.add(new Car("Bmw",3333));
	cars.add(new Car("Audi",4444));
	System.out.println(cars.size());

}}
