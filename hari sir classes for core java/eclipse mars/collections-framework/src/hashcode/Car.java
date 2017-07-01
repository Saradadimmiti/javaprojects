package hashcode;
//} = + ] ' " //
public class Car {
	String  name;
	int age;
	public Car(String name,int age){
		this.name=name;
		this.age=age;
				}
	public boolean equals(Object obj){
		Car c2=(Car)obj;
		return name.equals(c2.name);
	}
	public int hashcode(){
		return name.hashCode();
	}
}
