package polymorphicreference;
//} = + ] ' " //
public class Dog extends Animal {
	void eat(){
		System.out.println("Dog is eating...");
	}
	public static void main(String[] args) {
		Animal a=new Dog();
		a.eat();
	}
}
