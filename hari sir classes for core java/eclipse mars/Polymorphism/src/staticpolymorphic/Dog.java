package staticpolymorphic;
//} = + ] ' " //
public class Dog extends Animal {
	void shout(){
		
	}
	public static void main(String[] args) {
		Animal a=new Dog();
		a.eat();   //this works
		a.shout();  // compiler cheks for shout() in animal class
	}
}
