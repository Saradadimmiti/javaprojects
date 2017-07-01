package thiskey;
//} = + ] ' " //
public class Person {
	String name;
	void showName(){
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Rama";
		Person p2=new Person();
		p2.name="Sita";
		p1.showName();
		p2.showName();
	}

}
